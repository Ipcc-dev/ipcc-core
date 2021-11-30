package com.ipccc.ipcccore.app.controllers.usuario.impl;

import com.ipccc.ipcccore.app.controllers.usuario.UsuarioController;
import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import com.ipccc.ipcccore.app.service.usuario.UsuarioService;
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
@RequestMapping("/usuario")
@AllArgsConstructor
@Api(tags = "Usuarios API")

public class UsuarioControllerImpl implements UsuarioController {

  @Autowired
  private final UsuarioService service;

  @PostMapping
  public UsuarioEntity save(@RequestBody UsuarioEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public UsuarioEntity update(@RequestBody UsuarioEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public UsuarioEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<UsuarioEntity> findAll() {
    return service.findAll();
  }

  @Override
  @PostMapping("/nombre-usuario")
  public UsuarioEntity findByNombreDeUsuario(
      @PathVariable(name = "nombre-usuario") String nombreDeUsuario) {
    return service.findByNombreDeUsuario(nombreDeUsuario);
  }
}
