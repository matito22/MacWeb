package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.macdanys.mac.entitys.HistorialAlquileres;
import com.macdanys.mac.repositories.HistorialAlquileresDAO;

public class HistorialAlquileresService {
    @Autowired
    private HistorialAlquileresDAO historialAlquileresDAO;

     public List<HistorialAlquileres> traerTodos() {
        return historialAlquileresDAO.findAll();
    }

    public Optional<HistorialAlquileres> traerPorId(Integer id) {
        return historialAlquileresDAO.findById(id);
    }

    public HistorialAlquileres cHistorialAlquileres (HistorialAlquileres historialAlquileres) {
        return historialAlquileresDAO.save(historialAlquileres);
    }

    public HistorialAlquileres modHistorialAlquileres(HistorialAlquileres historialAlquileres) {
        return historialAlquileresDAO.save(historialAlquileres);
    }

    public void eliminarHistorialAlquileres(Integer id) {
        historialAlquileresDAO.deleteById(id);
    }

}
