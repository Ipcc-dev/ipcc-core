package com.ipccc.ipcccore.app.controllers;

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
public class PredioControllerImpl {

  @Autowired
  private final PredioService predioService;

  @PostMapping
  public PredioEntity save(@RequestBody PredioEntity entity) {
    return predioService.save(entity);
  }

  @PutMapping
  public PredioEntity update(@RequestBody PredioEntity entity) {
    return predioService.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    predioService.remove(id);
  }

  @GetMapping("/{id}")
  public PredioEntity read(@PathVariable(name = "id") Long id) {
    return predioService.read(id);
  }

  @GetMapping
  public List<PredioEntity> findAll() {
    return predioService.findAll();
  }
}
