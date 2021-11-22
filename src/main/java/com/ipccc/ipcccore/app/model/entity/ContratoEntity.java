package com.ipccc.ipcccore.app.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String uniqueId;

  private String estado;
  private String tipo;

  private Date fechaInicio;
  private Date fechaFin;

//  @ManyToOne(optional = false)
//  @JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = true)
//  private UsuarioEntity usuario;
}
