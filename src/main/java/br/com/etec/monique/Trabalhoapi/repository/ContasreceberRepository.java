package br.com.etec.monique.Trabalhoapi.repository;

import br.com.etec.monique.Trabalhoapi.model.Contasreceber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContasreceberRepository extends JpaRepository<Contasreceber, Integer> {
}
