package com.ipccc.ipcccore.app.controllers.rol.impl;

import com.ipccc.ipcccore.app.controllers.rol.RolController;
import com.ipccc.ipcccore.app.model.entity.RolEntity;
import com.ipccc.ipcccore.app.service.rol.RolService;
import io.swagger.annotations.Api;
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
@RequestMapping("/rol")
@AllArgsConstructor
@Api(tags = "Rol API")
public class RolControllerImpl implements RolController {

  @Autowired
  private final RolService service;

  @PostMapping
  public RolEntity save(@RequestBody RolEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public RolEntity update(@RequestBody RolEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public RolEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<RolEntity> findAll() {
    return service.findAll();
  }
}
