package com.ipccc.ipcccore.app.repository;

import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

  UsuarioEntity findByNombreDeUsuario(String nombreDeUsuario);

  UsuarioEntity findByNombreDeUsuarioAndPassword(String nombreDeUsuario, String password);
}
