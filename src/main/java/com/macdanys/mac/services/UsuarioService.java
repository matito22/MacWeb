package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.Usuario;

import com.macdanys.mac.repositories.UsuarioDAO;

public class UsuarioService {
 @Autowired
    private UsuarioDAO UsuarioDAO;

     public List<Usuario> traerTodos() {
        return UsuarioDAO.findAll();
    }

    public Optional<Usuario> traerPorId(Integer id) {
        return UsuarioDAO.findById(id);
    }

    public Usuario cUsuario (Usuario Usuario) {
        return UsuarioDAO.save(Usuario);
    }

    public Usuario modUsuario(Usuario Usuario) {
        return UsuarioDAO.save(Usuario);
    }

    public void eliminarUsuario(Integer id) {
        UsuarioDAO.deleteById(id);
    }
}
