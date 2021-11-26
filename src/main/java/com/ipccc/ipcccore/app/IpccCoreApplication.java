package com.ipccc.ipcccore.app;

import com.ipccc.ipcccore.app.model.entity.RolEntity;
import com.ipccc.ipcccore.app.model.entity.UsuarioEntity;
import com.ipccc.ipcccore.app.service.rol.RolService;
import com.ipccc.ipcccore.app.service.usuario.UsuarioService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IpccCoreApplication implements CommandLineRunner {

  @Autowired
  UsuarioService usuarioService;

  @Autowired
  RolService rolService;

  public static void main(String[] args) {
    SpringApplication.run(IpccCoreApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    RolEntity rolEntity = rolService.save(new RolEntity(0L, "admin", "admin"));
    UsuarioEntity usuarioEntity = new UsuarioEntity();
    usuarioEntity.setRoles(Arrays.asList(rolEntity));
    usuarioEntity.setPassword("En2das74b8");
    usuarioEntity.setNombreDeUsuario("SuperAdmin");
    usuarioEntity.setEnabled(true);
    usuarioService.save(usuarioEntity);
  }
}
