package com.ipccc.ipcccore.app.service.predio.impl;

import static com.ipccc.ipcccore.app.commons.Constants.PREDIO_NO_EXISTE;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.PredioEntity;
import com.ipccc.ipcccore.app.repository.PredioRepository;
import com.ipccc.ipcccore.app.service.predio.PredioService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PredioServiceImpl implements PredioService {

  private final PredioRepository repository;

  @Override
  public PredioEntity save(PredioEntity entity) {
    return repository.save(entity);
  }

  @Override
  public PredioEntity update(PredioEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public PredioEntity read(Long aLong) {
    return repository.findById(aLong).orElseThrow(() -> new ErrorException(PREDIO_NO_EXISTE));
  }

  @Override
  public List<PredioEntity> findAll() {
    return repository.findAll();
  }
}
