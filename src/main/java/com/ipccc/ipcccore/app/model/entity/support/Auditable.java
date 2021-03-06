package com.ipccc.ipcccore.app.model.entity.support;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable implements Serializable {

  private static final long serialVersionUID = 1L;

  @CreatedBy
  @Column(name = "created_by")
  protected String createdBy;

  @CreatedDate
  @Column(name = "created_date")
  @Temporal(TemporalType.TIMESTAMP)
  protected Date createdDate;

  @LastModifiedBy
  @Column(name = "modified_by")
  protected String modifiedBy;

  @LastModifiedDate
  @Column(name = "last_modified_date")
  @Temporal(TemporalType.TIMESTAMP)
  protected Date lastModifiedDate;
}