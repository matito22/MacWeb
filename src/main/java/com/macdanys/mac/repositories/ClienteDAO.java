package com.macdanys.mac.repositories;

import com.macdanys.mac.entitys.Alquiler;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.macdanys.mac.entitys.*;

public interface ClienteDAO extends JpaRepository<Cliente,Integer>{
    List<Cliente>findByNombClientes(String nombre,String apellido);

} 
