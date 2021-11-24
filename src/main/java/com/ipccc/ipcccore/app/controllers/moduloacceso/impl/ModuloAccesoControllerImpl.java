package com.ipccc.ipcccore.app.controllers.moduloacceso.impl;

import com.ipccc.ipcccore.app.controllers.moduloacceso.ModuloAccesoController;
import com.ipccc.ipcccore.app.model.entity.ModuloAccesoEntity;
import com.ipccc.ipcccore.app.service.moduloacceso.ModuloAccesoService;
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
@RequestMapping("/accesos")
@AllArgsConstructor
public class ModuloAccesoControllerImpl implements ModuloAccesoController {

  @Autowired
  private final ModuloAccesoService service;

  @PostMapping
  public ModuloAccesoEntity save(@RequestBody ModuloAccesoEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public ModuloAccesoEntity update(@RequestBody ModuloAccesoEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public ModuloAccesoEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<ModuloAccesoEntity> findAll() {
    return service.findAll();
  }

  @Override
  @GetMapping("/rol/{rol-id}")
  public List<ModuloAccesoEntity> findByRol( @PathVariable(name = "rol-id") Long rolId) {
    return service.findByRol(rolId);
  }
}
