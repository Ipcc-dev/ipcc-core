package com.ipccc.ipcccore.app.token;

import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUsuarioService {
  public UserDetails loadUserByUsername(String username, String password);
}
