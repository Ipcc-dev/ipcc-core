package com.ipccc.ipcccore.app.service.usuario.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import com.ipccc.ipcccore.app.repository.RolRepository;
import com.ipccc.ipcccore.app.repository.UsuarioRepository;
import com.ipccc.ipcccore.app.service.usuario.UsuarioService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

  private final UsuarioRepository repository;

  @Override
  public UsuarioEntity save(UsuarioEntity entity) {
    return repository.save(entity);
  }

  @Override
  public UsuarioEntity update(UsuarioEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public UsuarioEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  public List<UsuarioEntity> findAll() {
    return repository.findAll();
  }
}
