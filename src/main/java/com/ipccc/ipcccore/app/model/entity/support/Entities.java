package com.ipccc.ipcccore.app.model.entity.support;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class Entities<I extends Serializable> extends Auditable implements Persistable<I> {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected I id;

  @Override
  public boolean isNew() {
    return (id == null);
  }

  @Override
  public I getId() {
    return id;
  }
}