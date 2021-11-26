package com.ipccc.ipcccore.app.service.usuario;

import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import com.ipccc.ipcccore.app.service.CrudService;

public interface UsuarioService extends CrudService<UsuarioEntity, Long> {
  UsuarioEntity findByNombreDeUsuario(String nombreDeUsuario);

  UsuarioEntity findByNombreDeUsuarioAndPassword(String nombreDeUsuario, String password);
}
