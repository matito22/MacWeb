package com.macdanys.mac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import com.macdanys.mac.entitys.*;

public interface AlquilerDAO extends JpaRepository<Alquiler,Integer> {

    List<Alquiler> findByEstado(Estado estado);
    List<Alquiler> findByFechaComienzoBetweenOrEstado(LocalDate desde,LocalDate hasta,Estado estado);
    
} 