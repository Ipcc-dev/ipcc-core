package com.ipccc.ipcccore.app.token.service;


import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import com.ipccc.ipcccore.app.service.usuario.UsuarioService;
import com.ipccc.ipcccore.app.token.IUsuarioService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TokenService implements IUsuarioService {

  @Autowired
  UsuarioService usuarioService;


  @Override
  public UserDetails loadUserByUsername(String username, String password)
      throws UsernameNotFoundException {

    try {
      UsuarioEntity user = usuarioService.findByNombreDeUsuarioAndPassword(username, password);
      List<GrantedAuthority> authorities = user.getRoles().stream()
          .map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
          .collect(Collectors.toList());
      User user1 = new User(user.getNombreDeUsuario(), user.getPassword(),
          user.getEnabled(), true, true, true, authorities);
      return user1;
    } catch (Exception e) {
      String msg = "No existe usuario *" + username + "* en el sistema";
      e.printStackTrace();
      throw new UsernameNotFoundException(msg);
    }
  }

}
