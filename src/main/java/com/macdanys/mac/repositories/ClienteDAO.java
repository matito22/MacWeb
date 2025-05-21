package com.macdanys.mac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.macdanys.mac.entitys.*;

public interface ClienteDAO extends JpaRepository<Cliente,Integer>{
    List<Cliente>findByNombreAndApellido(String nombre,String apellido);

} 
