package com.macdanys.mac.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import com.macdanys.mac.dto.UsuarioDTO;
import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.Usuario;

import com.macdanys.mac.repositories.UsuarioDAO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
 @Autowired
    private UsuarioDAO usuarioDAO;


    public boolean eliminarUsuario(Integer idUsuario){
        Optional<Usuario> usuarioOptional=usuarioDAO.findById(idUsuario);

        if(usuarioOptional.isPresent()){
            Usuario usuario=usuarioOptional.get();
            usuarioDAO.delete(usuario);
            return true;
        }
        return false;
    }

    
     @Transactional
     public boolean modificarUsuario(Integer idUsuario,UsuarioDTO usuarioDTO){
        Optional<Usuario> usuarioOptional = usuarioDAO.findById(idUsuario);

        if(usuarioOptional.isPresent()){
           
            Usuario usuario=usuarioOptional.get();
            
            if(usuarioDTO.getNombreDeUsuario() !=null && !usuarioDTO.getNombreDeUsuario().isBlank()){
                usuario.setNombreDeUsuario(usuarioDTO.getNombreDeUsuario());
              
            }
            if(usuarioDTO.getPassword() !=null && !usuarioDTO.getPassword().isBlank()){// isBlank() es como isEmpty(), pero ignora espacios en blanco , validamos si es nullo y luego si esta o no en blanco
               
                usuario.setPassword(usuarioDTO.getPassword());
            }

            if (usuarioDTO.getTipoDeUsuario() != null) {
                usuario.setTipoDeUsuario(usuarioDTO.getTipoDeUsuario());
                
        }
            cUsuario(usuario);
        
             return true;
        }
    
            return false;
     }


    //Valida si el usuario existe, Mas adelante se agregara si es administrador o usuario comun para habilitar otras opciones en caso que sea administrador
     public boolean validarUsuario(String nombreDeUsuario,String password){
        Optional  usuarioOptional=usuarioDAO.findByNombreDeUsuario(nombreDeUsuario);
        
        if(usuarioOptional.isPresent()){
            Usuario usuario=(Usuario)usuarioOptional.get();
            return usuario.getPassword().equals(password);
        }else{
            return false;
        }
    }

    public List<Usuario> traerTodos() {
        return usuarioDAO.findAll();
    }

    public Optional<Usuario> findByNombreDeUsuario(String nombreDeUsuario){
        return usuarioDAO.findByNombreDeUsuario(nombreDeUsuario);
    }


    public Usuario cUsuario (Usuario Usuario) {
        return usuarioDAO.save(Usuario);
    }

    public Usuario modUsuario(Usuario Usuario) {
        return usuarioDAO.save(Usuario);
    }

    
}
