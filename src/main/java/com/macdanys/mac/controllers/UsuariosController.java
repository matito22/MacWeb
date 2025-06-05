package com.macdanys.mac.controllers;
import com.macdanys.mac.dto.UsuarioDTO;
import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.Usuario;
import com.macdanys.mac.services.AlquilerService;
import com.macdanys.mac.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


//Este controller es una seccion donde el administrador va a poder agregar un usuario(falta agregar que solo el administrador tenga acceso), eliminar o modificar. 
@RestController
@RequestMapping("/api/usuarios") // ruta base
public class UsuariosController {
    @Autowired
    UsuarioService usuarioService;

    //CREAR USUARIO POR POSTMAN FUNCIONA

    @PostMapping("/crearUsuario")
    public ResponseEntity<?> crearUsuario(@RequestParam String nombreDeUsuario , @RequestParam String password, @RequestParam TipoDeUsuario tipoDeUsuario) {

        if( nombreDeUsuario.isBlank() || password.isBlank() || tipoDeUsuario==null){
              return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Campos vacios");
        }
         
        Optional<Usuario> usuOptional=usuarioService.findByNombreDeUsuario(nombreDeUsuario);
         if (usuOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario en Uso");
            
        } else {
           Usuario usuario=new Usuario(nombreDeUsuario,password,tipoDeUsuario);
           usuarioService.cUsuario(usuario);
           return ResponseEntity.ok("Usuario creado");
        }

    }

    

    @DeleteMapping("/eliminarUsuario/{idUsuario}")//Para eliminar se usa DELETE y se pasa directamente el id por el url
        public ResponseEntity<?>eliminarUsuario(@PathVariable Integer idUsuario){
         Optional<Usuario> usOptional=usuarioService.findById(idUsuario);
        
        if(usOptional.isPresent()){
            usuarioService.eliminarUsuario(usOptional.get().getIdUsuario());
            return ResponseEntity.ok("Usuario eliminado");
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No existe ese usuario");    

    }
    
   @PutMapping("/modificarUsuario/{idUsuario}")//Se usa PUT(actualizar o reemplazar un recurso existente con la información proporcionada en la solicitud) , para un mejor control, el id usuario se pasa por el url y el body solo contiene los datos a modificar
    public ResponseEntity<?> modificarUsuario(@PathVariable Integer idUsuario, @RequestBody UsuarioDTO usuarioDTO) {

    boolean modificado = usuarioService.modificarUsuario(idUsuario, usuarioDTO);

    if (modificado) {
        return ResponseEntity.ok("Usuario Modificado");
    }

    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No se encuentra ese usuario");
    }
    
    
}
