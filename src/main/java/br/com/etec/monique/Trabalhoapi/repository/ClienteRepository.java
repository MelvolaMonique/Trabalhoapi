package br.com.etec.monique.Trabalhoapi.repository;

import br.com.etec.monique.Trabalhoapi.model.Cliente;
import br.com.etec.monique.Trabalhoapi.repository.filter.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {
}
