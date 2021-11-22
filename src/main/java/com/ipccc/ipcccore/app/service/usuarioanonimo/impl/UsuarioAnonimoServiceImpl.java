package com.ipccc.ipcccore.app.service.usuarioanonimo.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.UsuarioAnonimoEntity;
import com.ipccc.ipcccore.app.repository.UsuarioAnonimoRepository;
import com.ipccc.ipcccore.app.service.usuarioanonimo.UsuarioAnonimoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioAnonimoServiceImpl implements UsuarioAnonimoService {

  private final UsuarioAnonimoRepository repository;

  @Override
  public UsuarioAnonimoEntity save(UsuarioAnonimoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public UsuarioAnonimoEntity update(UsuarioAnonimoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public UsuarioAnonimoEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  public List<UsuarioAnonimoEntity> findAll() {
    return repository.findAll();
  }
}
