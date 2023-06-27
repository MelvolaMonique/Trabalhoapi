package br.com.etec.monique.Trabalhoapi.resource;

import br.com.etec.monique.Trabalhoapi.model.Contasreceber;
import br.com.etec.monique.Trabalhoapi.repository.ContasreceberRepository;
import br.com.etec.monique.Trabalhoapi.repository.filter.ContasreceberFilter;
import br.com.etec.monique.Trabalhoapi.repository.projections.ContasreceberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contasreceber")

public class ContasreceberResource {

  @Autowired
  private ContasreceberRepository contasreceberRepository;

  @GetMapping("/todos")
  public List<Contasreceber> listartodascontasreceber(){return contasreceberRepository.findAll();}

  @GetMapping()
  public Page<ContasreceberDto> pesquisar (ContasreceberFilter contasreceberFilter, Pageable pageable){
    return contasreceberRepository.Filtrar(ContasreceberFilter, pageable);
  }

}
