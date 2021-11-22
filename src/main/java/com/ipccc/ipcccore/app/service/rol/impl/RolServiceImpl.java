package com.ipccc.ipcccore.app.service.rol.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.RolEntity;
import com.ipccc.ipcccore.app.repository.RolRepository;
import com.ipccc.ipcccore.app.service.rol.RolService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RolServiceImpl implements RolService {

  private final RolRepository repository;

  @Override
  public RolEntity save(RolEntity entity) {
    return repository.save(entity);
  }

  @Override
  public RolEntity update(RolEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public RolEntity read(Long aLong) {
    return repository.findById(aLong).orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  @Override
  public List<RolEntity> findAll() {
    return repository.findAll();
  }
}
