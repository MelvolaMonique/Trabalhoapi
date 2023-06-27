package br.com.etec.monique.Trabalhoapi.repository.projections;

import br.com.etec.monique.Trabalhoapi.model.Contasreceber;

import java.math.BigDecimal;
import java.util.Date;

public class ContasreceberDto {
  private Integer id;
  private Date  dataconta;
  private BigDecimal valor;
  private String nomecliente;

  public ContasreceberDto(Integer id,Date dataconta, BigDecimal valor, String nomecliente ){
    this.id = id;
    this.dataconta = dataconta;
    this.valor = valor;
    this.nomecliente = nomecliente;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getDataconta() {
    return dataconta;
  }

  public void setDataconta(Date dataconta) {
    this.dataconta = dataconta;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public String getNomecliente() {
    return nomecliente;
  }

  public void setNomecliente(String nomecliente) {
    this.nomecliente = nomecliente;
  }
}
