package com.macdanys.mac.services;


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

    public Optional<Alquiler> traerPorId(Integer id) {
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

}
