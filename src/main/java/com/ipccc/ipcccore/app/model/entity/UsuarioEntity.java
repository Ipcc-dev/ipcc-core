package com.ipccc.ipcccore.app.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String uniqueId;
  @Column(unique = true, length = 20)
  private String nombreDeUsuario;

  @Column(length = 60)
  private String password;

  @Column(unique = true, length = 100)
  private String correo;

  private Boolean enabled;
  private String primerNombre;
  private String segundoNombre;
  private String primerApellido;
  private String segundoApellido;

  private String numeroDocumento;
  private String tipoDocumento;

  private String dependencia;

  private String tipoContrato;
  private String estadoContrato;
  private Date fechaInicioContrato;
  private Date fechaFinContrato;

  private String longitud;
  private String latitud;

  @ManyToMany(targetEntity = RolEntity.class, fetch = FetchType.LAZY)
  @JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"), uniqueConstraints = {
      @UniqueConstraint(columnNames = {"usuario_id", "rol_id"})})
  private List<RolEntity> roles;

}
