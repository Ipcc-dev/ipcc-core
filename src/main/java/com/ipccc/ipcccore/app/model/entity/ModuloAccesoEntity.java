package com.ipccc.ipcccore.app.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "modulo_acceso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModuloAccesoEntity {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  @ManyToOne(optional = false)
  @JoinColumn(name = "rol_id", referencedColumnName = "id", unique = false)
  private RolEntity rol;
}
