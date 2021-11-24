package com.ipccc.ipcccore.app.service.moduloacceso;

import com.ipccc.ipcccore.app.model.entity.ModuloAccesoEntity;
import com.ipccc.ipcccore.app.service.CrudService;
import java.util.List;

public interface ModuloAccesoService extends CrudService<ModuloAccesoEntity, Long> {

  List<ModuloAccesoEntity> findByRol(Long rolId);
}
