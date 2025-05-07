package com.macdanys.mac.repositories;

import com.macdanys.mac.entitys.Alquiler;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.macdanys.mac.entitys.*;

public interface AlquilerDAO extends JpaRepository<Alquiler,Integer> {

    List<Alquiler> findByEstado(Estado estado);
} 