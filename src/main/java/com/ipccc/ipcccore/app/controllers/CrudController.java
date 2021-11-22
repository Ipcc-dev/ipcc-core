package com.ipccc.ipcccore.app.controllers;

import java.util.List;

public interface CrudController<T, ID> {

  T save(T entity);

  T update(T entity);

  void remove(ID id);

  T read(ID id);

  List<T> findAll();
}
