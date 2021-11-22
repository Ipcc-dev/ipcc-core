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
@Table(name = "predios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PredioEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String direccion;
  private String manzana;
  private String numero_predio;
  private String tipoDeMueble;
  private String tipologia;
  private String uso;
  private String normativaVigente;
  private String nombrePropietario;
  private String apellidoPropietario;
  private String telefono;
  private String correoElectronico;
  private String longitud;
  private String latitud;
  private Long intervenciones;
  private Long numeroProcesos;
  private String sanciones;

}
