package com.ipccc.ipcccore.app.model.entity;

import com.ipccc.ipcccore.app.model.entity.support.Entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "anonimo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioAnonimoEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String uniqueId;
  @Column(unique = true, length = 20)
  private String nombreDeUsuario;

  @Column(length = 60)
  private String password;

  private String correo;
  private Date fechaIngreso;
  private String longitud;
  private String latitud;
  private Boolean enabled;


}
