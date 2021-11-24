package com.ipccc.ipcccore.app.repository;

import com.ipccc.ipcccore.app.model.entity.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<ContratoEntity, Long> {
//
//  @Query("SELECT b FROM ContratoEntity b INNER JOIN UsuarioEntity a ON a.id = b.usuario.id AND a.id = :usuarioId")
//  ContratoEntity findByUsuarioId(Long usuarioId);

}
