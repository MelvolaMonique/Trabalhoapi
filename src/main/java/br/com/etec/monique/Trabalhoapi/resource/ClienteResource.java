package br.com.etec.monique.Trabalhoapi.resource;

import br.com.etec.monique.Trabalhoapi.model.Cliente;
import br.com.etec.monique.Trabalhoapi.repository.ClienteRepository;
import br.com.etec.monique.Trabalhoapi.repository.filter.ClienteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteResource {
  @Autowired
  private ClienteRepository clienteRepository;

  @GetMapping()
  public Page<Cliente> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
    return clienteRepository.Filtrar(clienteFilter, pageable);
  }
  @GetMapping("/todos")
  public List<Cliente> listartodosclientes(){ return clienteRepository.findAll();
  }
}
