package com.macdanys.mac.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.Usuario;
import java.util.Optional;


public interface UsuarioDAO extends JpaRepository<Usuario,Integer>{

    Optional<Usuario> findByNombreDeUsuario(String nombreDeUsuario);

} 
