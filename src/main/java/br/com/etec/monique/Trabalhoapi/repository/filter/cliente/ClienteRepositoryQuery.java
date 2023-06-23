package br.com.etec.monique.Trabalhoapi.repository.filter.cliente;

import br.com.etec.monique.Trabalhoapi.model.Cliente;
import br.com.etec.monique.Trabalhoapi.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {
  public Page<Cliente> Filtrar(ClienteFilter clienteFilter, Pageable pageable);
}
