package com.ipccc.ipcccore.app.controllers.contrato.impl;

import com.ipccc.ipcccore.app.controllers.contrato.ContratoController;
import com.ipccc.ipcccore.app.model.entity.ContratoEntity;
import com.ipccc.ipcccore.app.service.contrato.ContratoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contrato")
@AllArgsConstructor
public class ContratoControllerImpl implements ContratoController {

  @Autowired
  private final ContratoService service;

  @PostMapping
  public ContratoEntity save(@RequestBody ContratoEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public ContratoEntity update(@RequestBody ContratoEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public ContratoEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<ContratoEntity> findAll() {
    return service.findAll();
  }

//  @GetMapping("/usuario/{id}")
//  public ContratoEntity findByUsuarioId(Long usuarioId) {
//    return service.findByUsuarioId(usuarioId);
//  }
}
