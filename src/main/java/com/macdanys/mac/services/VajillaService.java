 package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macdanys.mac.entitys.TipoDeVajilla;
import com.macdanys.mac.entitys.Usuario;
import com.macdanys.mac.entitys.Vajilla;
import com.macdanys.mac.repositories.VajillaDAO;

@Service
public class VajillaService {
   @Autowired
    private VajillaDAO VajillaDAO;

     public List<Vajilla> traerTodos() {
        return VajillaDAO.findAll();
    }
    public Optional<Vajilla> findByTipoDeVajilla(TipoDeVajilla tipoDeVajilla){
        return VajillaDAO.findByTipoDeVajilla(tipoDeVajilla);
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
