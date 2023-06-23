package br.com.etec.monique.Trabalhoapi.repository.filter;

import java.math.BigDecimal;
import java.util.Date;

public class ContasreceberFilter {

  private Date dataconta;

  private BigDecimal valor;

  private String nomecliente;

  public String getNomecliente() {
    return nomecliente;
  }

  public void setNomecliente(String nomecliente) {
    this.nomecliente = nomecliente;
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
}
