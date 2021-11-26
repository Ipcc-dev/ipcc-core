package com.ipccc.ipcccore.app.service.documento.impl;

import com.ipccc.ipcccore.app.commons.ErrorException;
import com.ipccc.ipcccore.app.model.entity.DocumentoEntity;
import com.ipccc.ipcccore.app.repository.DocumentoRepository;
import com.ipccc.ipcccore.app.service.documento.DocumentoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DocumentoServiceImpl implements DocumentoService {

  private final DocumentoRepository repository;

  @Override
  public DocumentoEntity save(DocumentoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public DocumentoEntity update(DocumentoEntity entity) {
    return repository.save(entity);
  }

  @Override
  public void remove(Long aLong) {
    repository.deleteById(aLong);
  }

  @Override
  public DocumentoEntity read(Long aLong) {
    return repository.findById(aLong)
        .orElseThrow(() -> new ErrorException("ROL no existe"));
  }

  public List<DocumentoEntity> findAll() {
    return repository.findAll();
  }
}
