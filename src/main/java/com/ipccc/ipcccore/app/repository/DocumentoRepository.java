package com.ipccc.ipcccore.app.repository;

import com.ipccc.ipcccore.app.model.entity.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<DocumentoEntity, Long> {
//
//  @Query("SELECT b FROM DocumentoEntity b INNER JOIN UsuarioEntity a ON a.id = b.usuario.id AND a.id = :usuarioId")
//  DocumentoEntity findByUsuarioId(Long usuarioId);

}
