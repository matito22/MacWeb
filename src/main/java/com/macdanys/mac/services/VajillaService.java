 package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Vajilla;
import com.macdanys.mac.repositories.VajillaDAO;


public class VajillaService {
   @Autowired
    private VajillaDAO VajillaDAO;

     public List<Vajilla> traerTodos() {
        return VajillaDAO.findAll();
    }

    public Optional<Vajilla> traerPorId(Integer id) {
        return VajillaDAO.findById(id);
    }

    public Vajilla cVajilla (Vajilla Vajilla) {
        return VajillaDAO.save(Vajilla);
    }

    public Vajilla modVajilla(Vajilla Vajilla) {
        return VajillaDAO.save(Vajilla);
    }

    public void eliminarVajilla(Integer id) {
        VajillaDAO.deleteById(id);
    }
}
