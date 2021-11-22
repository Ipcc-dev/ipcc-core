package com.ipccc.ipcccore.app.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "matricula")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String proceso;
  private String tipoDocumento;
  private String numero_informe;
  private String Actualizaciones;



}
