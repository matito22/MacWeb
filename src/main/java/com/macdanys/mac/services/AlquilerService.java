package com.macdanys.mac.services;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.repositories.AlquilerDAO;

public class AlquilerService {
  @Autowired
    private AlquilerDAO alquilerDao;

     public List<Alquiler> traerTodos() {
        return alquilerDao.findAll();
    }

    public List<Alquiler>findByFechaOEstado(LocalDate desde, LocalDate hasta,Estado estado){
        return alquilerDao.findByFechaOEstado(desde,hasta,estado);
    }
    

    public Optional<Alquiler> findById(Integer id) {
        return alquilerDao.findById(id);
    }

    public List<Alquiler> traerPorEstado(Estado estado) {
        return alquilerDao.findByEstado(estado);
    }

    public Alquiler crearAlquiler(Alquiler alquiler) {
        return alquilerDao.save(alquiler);
    }

    public Alquiler modificarAlquiler(Alquiler alquiler) {
        return alquilerDao.save(alquiler);
    }

    public void eliminarAlquiler(Integer id) {
        alquilerDao.deleteById(id);
    }

    public void modificarEstadoAlquiler(Estado nuevoEstado, Integer id) {
    Optional<Alquiler> alquilerOptional = alquilerDao.findById(id);
    if (alquilerOptional.isPresent()) {
        Alquiler alquiler = alquilerOptional.get();
        alquiler.setEstado(nuevoEstado);
        alquilerDao.save(alquiler);
    }
}

}
