package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.macdanys.mac.entitys.InventarioMovimientos;
import com.macdanys.mac.repositories.InventarioMovimientosDAO;
import org.springframework.stereotype.Service;

@Service
public class InventarioMovimientosService {

    @Autowired
    private InventarioMovimientosDAO inventarioMovimientosDAO;

     public List<InventarioMovimientos> traerTodos() {
        return inventarioMovimientosDAO.findAll();
    }

    public Optional<InventarioMovimientos> traerPorId(Integer id) {
        return inventarioMovimientosDAO.findById(id);
    }

    public InventarioMovimientos cInventarioMovimientos (InventarioMovimientos inventarioMovimientos) {
        return inventarioMovimientosDAO.save(inventarioMovimientos);
    }

    public InventarioMovimientos modInventarioMovimientos(InventarioMovimientos inventarioMovimientos) {
        return inventarioMovimientosDAO.save(inventarioMovimientos);
    }

    public void eliminarInventarioMovimientos(Integer id) {
        inventarioMovimientosDAO.deleteById(id);
    }


}
