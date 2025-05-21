package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.macdanys.mac.entitys.DetalleAlquiler;
import com.macdanys.mac.repositories.DetalleAlquilerDAO;
import org.springframework.stereotype.Service;

@Service
public class DetalleAlquilerService {
      @Autowired
    private DetalleAlquilerDAO detalleAlquilerDAO;

     public List<DetalleAlquiler> traerTodos() {
        return detalleAlquilerDAO.findAll();
    }

    public Optional<DetalleAlquiler> traerPorId(Integer id) {
        return detalleAlquilerDAO.findById(id);
    }


    public DetalleAlquiler cDetalleAlquiler (DetalleAlquiler detalleAlquiler) {
        return detalleAlquilerDAO.save(detalleAlquiler);
    }

    public DetalleAlquiler modDetalleAlquiler(DetalleAlquiler detalleAlquiler) {
        return detalleAlquilerDAO.save(detalleAlquiler);
    }

    public void eliminarDetalleAlquiler(Integer id) {
        detalleAlquilerDAO.deleteById(id);
    }

 }