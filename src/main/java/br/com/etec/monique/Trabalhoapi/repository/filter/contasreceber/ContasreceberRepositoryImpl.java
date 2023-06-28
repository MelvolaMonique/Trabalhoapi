package br.com.etec.monique.Trabalhoapi.repository.filter.contasreceber;

import br.com.etec.monique.Trabalhoapi.model.Contasreceber;
import br.com.etec.monique.Trabalhoapi.repository.filter.ContasreceberFilter;
import br.com.etec.monique.Trabalhoapi.repository.projections.ContasreceberDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContasreceberRepositoryImpl implements ContasreceberRepositoryQuery {

  @PersistenceContext
  private EntityManager manager;

  @Override
  public Page<ContasreceberDto> Filtrar(ContasreceberFilter contasreceberFilter, Pageable pageable){

    CriteriaBuilder builder = manager.getCriteriaBuilder();
    CriteriaQuery<ContasreceberDto> criteria = builder.createQuery(ContasreceberDto.class);
    Root<Contasreceber> root = criteria.from(Contasreceber.class);

    criteria.select(builder.construct(ContasreceberDto.class
      ,root.get("id")
      ,root.get("dataconta")
      ,root.get("valor")
      ,root.get("cliente").get("nomecliente")
    ));
    Predicate[] predicates = criarRestricoes(contasreceberFilter, builder, root);
    criteria.where(predicates);
    criteria.orderBy(builder.asc(root.get("dataconta")));

    TypedQuery<ContasreceberDto> query = manager.createQuery(criteria);
    adicionarRestricoesDePaginacao(query, pageable);

    return new PageImpl<>(query.getResultList(), pageable, total(contasreceberFilter));



  }

  private Long total(ContasreceberFilter contasreceberFilter) {

    CriteriaBuilder builder = manager.getCriteriaBuilder();
    CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
    Root<Contasreceber> root = criteria.from(Contasreceber.class);

    Predicate[] predicates = criarRestricoes(contasreceberFilter, builder, root);
    criteria.where(predicates);
    criteria.orderBy(builder.asc(root.get("dataconta")));

    criteria.select(builder.count(root));

    return  manager.createQuery(criteria).getSingleResult();

  }

  private void adicionarRestricoesDePaginacao(TypedQuery<ContasreceberDto> query, Pageable pageable) {
    int paginaAtual = pageable.getPageNumber();
    int totalRegistrosPorPagina = pageable.getPageSize();
    int primieroRegistroPagina = paginaAtual * totalRegistrosPorPagina;

    query.setFirstResult(primieroRegistroPagina);
    query.setMaxResults(totalRegistrosPorPagina);
  }

  private Predicate[] criarRestricoes(ContasreceberFilter contasreceberFilter, CriteriaBuilder builder, Root<Contasreceber> root) {
    List<Predicate> predicates = new ArrayList<>();

    if (!StringUtils.isEmpty(contasreceberFilter.getNomecliente())) {
      predicates.add(builder.like(builder.lower(root.get("cliente").get("nomecliente")),
        "%" + contasreceberFilter.getNomecliente().toLowerCase() + "%"));
    }
    if (contasreceberFilter.getValor() != null) {
      predicates.add(builder.greaterThanOrEqualTo(root.get("valor"), contasreceberFilter.getValor()));

    }

    if (contasreceberFilter.getDataconta() != null){
      predicates.add(builder.greaterThanOrEqualTo(root.get("data"), contasreceberFilter.getDataconta())
      );

    }
    if (contasreceberFilter.getDataconta() != null){
      predicates.add(builder.lessThanOrEqualTo(root.get("dataconta"),contasreceberFilter.getDataconta())
      );
    }
    return predicates.toArray(new Predicate[predicates.size()]);
  }


}
