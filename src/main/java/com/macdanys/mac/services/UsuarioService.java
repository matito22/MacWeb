package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.Usuario;

import com.macdanys.mac.repositories.UsuarioDAO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
 @Autowired
    private UsuarioDAO UsuarioDAO;

     public List<Usuario> traerTodos() {
        return UsuarioDAO.findAll();
    }

    public Optional<Usuario> findByNombreDeUsuario(String nombreDeUsuario){
        return UsuarioDAO.findByNombreDeUsuario(nombreDeUsuario);
    }


    //Valida si el usuario existe, Mas adelante se agregara si es administrador o usuario comun para habilitar otras opciones en caso que sea administrador
     public boolean validarUsuario(String nombreDeUsuario,String password){
        Optional  usuarioOptional=UsuarioDAO.findByNombreDeUsuario(nombreDeUsuario);
        
        if(usuarioOptional.isPresent()){
            Usuario usuario=(Usuario)usuarioOptional.get();
            return usuario.getPassword().equals(password);
        }else{
            return false;
        }
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
