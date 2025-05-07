package com.macdanys.mac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macdanys.mac.entitys.Stock;
import java.util.List;

public interface StockDAO extends JpaRepository<Stock,Integer> {

    public List<Stock>findByCantidadDisponible(Integer cantidadDisponible);
} 

  