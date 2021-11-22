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

  private final PredioRepository predioRepository;

  @Override
  public PredioEntity save(PredioEntity entity) {
    return predioRepository.save(entity);
  }

  @Override
  public PredioEntity update(PredioEntity entity) {
    return predioRepository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    predioRepository.deleteById(aLong);
  }

  @Override
  public PredioEntity read(Long aLong) {
    return predioRepository.findById(aLong).orElseThrow(() -> new ErrorException(PREDIO_NO_EXISTE));
  }

  @Override
  public List<PredioEntity> findAll() {
    return predioRepository.findAll();
  }
}
