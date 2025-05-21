package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Cliente;
import com.macdanys.mac.repositories.ClienteDAO;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDao;

     public List<Cliente> traerTodos() {
        return clienteDao.findAll();
    }

    public Optional<Cliente> traerPorId(Integer id) {
        return clienteDao.findById(id);
    }

    public List<Cliente> findByNombreAndApellido(String nombre,String apellido) {
        return clienteDao.findByNombreAndApellido(nombre, apellido);
    }

    public Cliente crearCliente (Cliente cliente) {
        return clienteDao.save(cliente);
    }

    public Cliente modificarCliente(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    public void eliminarCliente(Integer id) {
        clienteDao.deleteById(id);
    }
}
