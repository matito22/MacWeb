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


@RestController
@RequestMapping("/api/usuarios") // ruta base
public class UsuariosController {
    @Autowired
    UsuarioService usuarioService;

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
    
    
}
