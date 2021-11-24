package com.ipccc.ipcccore.app.service.moduloacceso.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.ModuloAccesoEntity;
import com.ipccc.ipcccore.app.repository.ModuloAccesoRepository;
import com.ipccc.ipcccore.app.service.moduloacceso.ModuloAccesoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModuloAccesoServiceImpl implements ModuloAccesoService {

  private final ModuloAccesoRepository repository;

  @Override
  public ModuloAccesoEntity save(ModuloAccesoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public ModuloAccesoEntity update(ModuloAccesoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public ModuloAccesoEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  @Override
  public List<ModuloAccesoEntity> findByRol(Long rolId) {
    return repository.findByRol(rolId);
  }

  public List<ModuloAccesoEntity> findAll() {
    return repository.findAll();
  }
}
