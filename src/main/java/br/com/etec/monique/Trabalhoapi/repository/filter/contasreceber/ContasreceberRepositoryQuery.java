package br.com.etec.monique.Trabalhoapi.repository.filter.contasreceber;

import br.com.etec.monique.Trabalhoapi.repository.filter.ContasreceberFilter;
import br.com.etec.monique.Trabalhoapi.repository.projections.ContasreceberDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasreceberRepositoryQuery {
  public Page<ContasreceberDto> Filtrar (ContasreceberFilter contasreceberFilter, Pageable pageable);
}
