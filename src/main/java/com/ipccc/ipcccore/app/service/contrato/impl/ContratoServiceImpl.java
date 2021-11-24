package com.ipccc.ipcccore.app.service.contrato.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.ContratoEntity;
import com.ipccc.ipcccore.app.repository.ContratoRepository;
import com.ipccc.ipcccore.app.service.contrato.ContratoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContratoServiceImpl implements ContratoService {

  private final ContratoRepository repository;

  @Override
  public ContratoEntity save(ContratoEntity entity) {

    return repository.save(entity);
  }

//  public ContratoEntity findByUsuarioId(Long usuarioId){
//    return repository.findByUsuarioId(usuarioId);
//  }

  @Override
  public ContratoEntity update(ContratoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public ContratoEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  public List<ContratoEntity> findAll() {
    return repository.findAll();
  }
}
