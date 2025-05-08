package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.macdanys.mac.entitys.GastoExterno;
import com.macdanys.mac.repositories.GastoExternoDAO;

public class GastoExternoService {
      @Autowired
    private GastoExternoDAO gastoExternoDAO;

     public List<GastoExterno> traerTodos() {
        return gastoExternoDAO.findAll();
    }

    public Optional<GastoExterno> traerPorId(Integer id) {
        return gastoExternoDAO.findById(id);
    }

    public GastoExterno cGastoExterno (GastoExterno gastoExterno) {
        return gastoExternoDAO.save(gastoExterno);
    }

    public GastoExterno modGastoExterno(GastoExterno gastoExterno) {
        return gastoExternoDAO.save(gastoExterno);
    }

    public void eliminarGastoExterno(Integer id) {
        gastoExternoDAO.deleteById(id);
    }
}
