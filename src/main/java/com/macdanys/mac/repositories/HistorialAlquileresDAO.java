package com.macdanys.mac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macdanys.mac.entitys.HistorialAlquileres;
import java.util.List;

public interface HistorialAlquileresDAO extends JpaRepository<HistorialAlquileres,Integer> {

    public List<HistorialAlquileres>findByIdHistorialAlquiler(Integer idHistorialAlquiler);
} 
  
    
