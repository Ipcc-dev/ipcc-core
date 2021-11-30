package com.ipccc.ipcccore.app.controllers.documento.impl;

import com.ipccc.ipcccore.app.controllers.documento.DocumentoController;
import com.ipccc.ipcccore.app.model.entity.DocumentoEntity;
import com.ipccc.ipcccore.app.service.documento.DocumentoService;
import io.swagger.annotations.Api;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
@RequestMapping("/documento")
@AllArgsConstructor
@Api(tags = "Documentos API")
public class DocumentoControllerImpl implements DocumentoController {

  @Autowired
  private final DocumentoService service;

  @PostMapping
  public DocumentoEntity save(@RequestBody DocumentoEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public DocumentoEntity update(@RequestBody DocumentoEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public DocumentoEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<DocumentoEntity> findAll() {
    return service.findAll();
  }

}
