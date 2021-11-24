package com.ipccc.ipcccore.app.repository;


import com.ipccc.ipcccore.app.model.entity.ModuloAccesoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ModuloAccesoRepository extends JpaRepository<ModuloAccesoEntity, Long> {
  @Query("SELECT l FROM ModuloAccesoEntity l INNER JOIN RolEntity a ON a.id = l.rol.id AND a.id = :rolId")
  List<ModuloAccesoEntity> findByRol(Long rolId);
}
