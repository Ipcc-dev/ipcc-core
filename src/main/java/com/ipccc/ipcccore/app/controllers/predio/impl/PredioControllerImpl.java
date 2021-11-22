package com.ipccc.ipcccore.app.controllers.predio.impl;

import com.ipccc.ipcccore.app.controllers.predio.PredioController;
import com.ipccc.ipcccore.app.model.entity.PredioEntity;
import com.ipccc.ipcccore.app.service.predio.PredioService;
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
@RequestMapping("/predio")
@AllArgsConstructor
public class PredioControllerImpl implements PredioController {

  @Autowired
  private final PredioService service;

  @PostMapping
  public PredioEntity save(@RequestBody PredioEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public PredioEntity update(@RequestBody PredioEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public PredioEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<PredioEntity> findAll() {
    return service.findAll();
  }
}
