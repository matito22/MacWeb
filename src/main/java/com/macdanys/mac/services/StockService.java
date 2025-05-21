package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Stock;

import com.macdanys.mac.repositories.StockDAO;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    private StockDAO StockDAO;

     public List<Stock> traerTodos() {
        return StockDAO.findAll();
    }

    public List<Stock>traetCantidadDisponible(Integer cantidadDisponible){
        return StockDAO.findByCantidadDisponible(cantidadDisponible);
    }

    public Optional<Stock> traerPorId(Integer id) {
        return StockDAO.findById(id);
    }

    public Stock cStock (Stock Stock) {
        return StockDAO.save(Stock);
    }

    public Stock modStock(Stock Stock) {
        return StockDAO.save(Stock);
    }

    public void eliminarStock(Integer id) {
        StockDAO.deleteById(id);
    }
    }
