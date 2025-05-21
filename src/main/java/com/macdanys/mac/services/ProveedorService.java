package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Proveedor;

import com.macdanys.mac.repositories.ProveedorDAO;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {
 @Autowired
    private ProveedorDAO ProveedorDAO;

     public List<Proveedor> traerTodos() {
        return ProveedorDAO.findAll();
    }

    public Optional<Proveedor> traerPorId(Integer id) {
        return ProveedorDAO.findById(id);
    }

    public Proveedor cProveedor (Proveedor Proveedor) {
        return ProveedorDAO.save(Proveedor);
    }

    public Proveedor modProveedor(Proveedor Proveedor) {
        return ProveedorDAO.save(Proveedor);
    }

    public void eliminarProveedor(Integer id) {
        ProveedorDAO.deleteById(id);
    }
  
}
