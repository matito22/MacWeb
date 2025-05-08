package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.InventarioMovimientos;
import com.macdanys.mac.entitys.Multa;
import com.macdanys.mac.repositories.MultaDAO;


public class MultaService {
     @Autowired
    private MultaDAO multaDAO;

     public List<Multa> traerTodos() {
        return multaDAO.findAll();
    }

    public Optional<Multa> traerPorId(Integer id) {
        return multaDAO.findById(id);
    }

    public Multa cMulta (Multa Multa) {
        return multaDAO.save(Multa);
    }

    public Multa modMulta(Multa Multa) {
        return multaDAO.save(Multa);
    }

    public void eliminarMulta(Integer id) {
        multaDAO.deleteById(id);
    }
}
