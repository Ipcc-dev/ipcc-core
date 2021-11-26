package com.ipccc.ipcccore.app.token;

import org.springframework.security.core.userdetails.UserDetails;

public interface IUsuarioService {

  UserDetails loadUserByUsername(String username, String password);
}
