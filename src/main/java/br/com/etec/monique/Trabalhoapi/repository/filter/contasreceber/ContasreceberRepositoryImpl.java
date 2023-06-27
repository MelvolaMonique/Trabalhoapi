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

  private Predicate[] criarRestricoes(ContasreceberFilter contasreceberFilter, CriteriaBuilder builder, Root<Contasreceber> root) {
    List<Predicate> predicates = new ArrayList<>();

    if (contasreceberFilter.getDataconta() != null){
      
    }
  }


}
