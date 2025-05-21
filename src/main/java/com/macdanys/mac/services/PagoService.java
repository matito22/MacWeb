package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.macdanys.mac.entitys.Pago;
import com.macdanys.mac.repositories.PagoDAO;
import org.springframework.stereotype.Service;

@Service
public class PagoService {
     @Autowired
    private PagoDAO pagoDAO;

     public List<Pago> traerTodos() {
        return pagoDAO.findAll();
    }

    public Optional<Pago> traerPorId(Integer id) {
        return pagoDAO.findById(id);
    }

    public Pago cPago (Pago pago) {
        return pagoDAO.save(pago);
    }

    public Pago modPago(Pago pago) {
        return pagoDAO.save(pago);
    }

    public void eliminarPago(Integer id) {
        pagoDAO.deleteById(id);
    }
  
}
