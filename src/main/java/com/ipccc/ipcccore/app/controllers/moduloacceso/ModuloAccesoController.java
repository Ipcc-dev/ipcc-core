package com.ipccc.ipcccore.app.controllers.moduloacceso;

import com.ipccc.ipcccore.app.controllers.CrudController;
import com.ipccc.ipcccore.app.model.entity.ModuloAccesoEntity;
import java.util.List;

public interface ModuloAccesoController extends CrudController<ModuloAccesoEntity, Long> {

  List<ModuloAccesoEntity> findByRol(Long rolId);
}
