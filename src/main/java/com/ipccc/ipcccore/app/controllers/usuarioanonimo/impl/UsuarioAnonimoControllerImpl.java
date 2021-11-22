package com.ipccc.ipcccore.app.controllers.usuarioanonimo.impl;

import com.ipccc.ipcccore.app.controllers.usuarioanonimo.UsuarioAnonimoController;
import com.ipccc.ipcccore.app.model.entity.UsuarioAnonimoEntity;
import com.ipccc.ipcccore.app.service.usuarioanonimo.UsuarioAnonimoService;
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
@RequestMapping("/anonimo")
@AllArgsConstructor
public class UsuarioAnonimoControllerImpl implements UsuarioAnonimoController {

  @Autowired
  private final UsuarioAnonimoService service;

  @PostMapping
  public UsuarioAnonimoEntity save(@RequestBody UsuarioAnonimoEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public UsuarioAnonimoEntity update(@RequestBody UsuarioAnonimoEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public UsuarioAnonimoEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<UsuarioAnonimoEntity> findAll() {
    return service.findAll();
  }
}
