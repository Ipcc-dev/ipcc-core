package com.ipccc.ipcccore.app.service.visita.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.UsuarioAnonimoEntity;
import com.ipccc.ipcccore.app.model.entity.VisitaEntity;
import com.ipccc.ipcccore.app.repository.UsuarioAnonimoRepository;
import com.ipccc.ipcccore.app.repository.VisitaRepository;
import com.ipccc.ipcccore.app.service.visita.VisitaService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VisitaServiceImpl implements VisitaService {

  private final VisitaRepository repository;

  @Override
  public VisitaEntity save(VisitaEntity entity) {
    return repository.save(entity);
  }

  @Override
  public VisitaEntity update(VisitaEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public VisitaEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  public List<VisitaEntity> findAll() {
    return repository.findAll();
  }
}
