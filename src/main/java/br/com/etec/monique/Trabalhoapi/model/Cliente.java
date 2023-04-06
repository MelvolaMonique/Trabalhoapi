package br.com.etec.monique.Trabalhoapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="cliente")

public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nomecliente;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNomecliente() {
    return nomecliente;
  }

  public void setNomecliente(String nomecliente) {
    this.nomecliente = nomecliente;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cliente cliente = (Cliente) o;
    return id.equals(cliente.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}