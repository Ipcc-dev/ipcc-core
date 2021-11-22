package com.ipccc.ipcccore.app.service;

import com.ipccc.ipcccore.app.model.entity.RolEntity;
import java.util.List;

public interface CrudService<T, ID> {

  T save(T entity);

  T update(T entity);

  void remove(ID id);

  T read(ID id);

  List<T> findAll();
}
