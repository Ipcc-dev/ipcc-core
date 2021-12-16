package com.ipccc.ipcccore.app.controllers.visita.impl;

import com.ipccc.ipcccore.app.controllers.visita.VisitaController;
import com.ipccc.ipcccore.app.model.entity.UsuarioAnonimoEntity;
import com.ipccc.ipcccore.app.model.entity.VisitaEntity;
import com.ipccc.ipcccore.app.service.usuarioanonimo.UsuarioAnonimoService;
import com.ipccc.ipcccore.app.service.visita.VisitaService;
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
@RequestMapping("/visita")
@AllArgsConstructor
@Api(tags = "Visita API")
public class VisitaControllerImpl implements VisitaController {

  @Autowired
  private final VisitaService service;

  @PostMapping
  public VisitaEntity save(@RequestBody VisitaEntity entity) {
    return service.save(entity);
  }

  @PutMapping
  public VisitaEntity update(@RequestBody VisitaEntity entity) {
    return service.update(entity);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable(name = "id") Long id) {
    service.remove(id);
  }

  @GetMapping("/{id}")
  public VisitaEntity read(@PathVariable(name = "id") Long id) {
    return service.read(id);
  }

  @GetMapping
  public List<VisitaEntity> findAll() {
    return service.findAll();
  }
}
