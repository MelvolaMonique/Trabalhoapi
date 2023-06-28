package br.com.etec.monique.Trabalhoapi.repository;

import br.com.etec.monique.Trabalhoapi.model.Contasreceber;
import br.com.etec.monique.Trabalhoapi.repository.filter.contasreceber.ContasreceberRepositoryQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContasreceberRepository extends JpaRepository<Contasreceber, Integer>, ContasreceberRepositoryQuery {


}
