package com.ipccc.ipcccore.app.model.entity;

import com.ipccc.ipcccore.app.model.entity.types.EstadoDocumento;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "documento")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String tipo;

  @Enumerated(value = EnumType.STRING)
  private EstadoDocumento estado;

}
