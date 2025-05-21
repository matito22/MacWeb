package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.TipoDeVajilla;

import com.macdanys.mac.repositories.TipoDeVajillaDAO;

import org.springframework.stereotype.Service;

@Service
public class TipoDeVajillaService {
    @Autowired
    private TipoDeVajillaDAO TipoDeVajillaDAO;

     public List<TipoDeVajilla> traerTodos() {
        return TipoDeVajillaDAO.findAll();
    }

    public Optional<TipoDeVajilla> traerPorId(Integer id) {
        return TipoDeVajillaDAO.findById(id);
    }

    public TipoDeVajilla cTipoDeVajilla (TipoDeVajilla TipoDeVajilla) {
        return TipoDeVajillaDAO.save(TipoDeVajilla);
    }

    public TipoDeVajilla modTipoDeVajilla(TipoDeVajilla TipoDeVajilla) {
        return TipoDeVajillaDAO.save(TipoDeVajilla);
    }

    public void eliminarTipoDeVajilla(Integer id) {
        TipoDeVajillaDAO.deleteById(id);
    }
}
