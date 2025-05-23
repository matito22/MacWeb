package com.macdanys.mac.controllers;

import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.entitys.Usuario;
import com.macdanys.mac.services.AlquilerService;
import com.macdanys.mac.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios") // ruta base
public class LoginController {

    UsuarioService usuarioService;


     @PostMapping("/crear")
    public Usuario crearUsuarioController(@RequestBody Usuario usuario){
        return usuarioService.cUsuario(usuario);
    }
    
     @PostMapping("/validar")
    public ResponseEntity<String> validarUsuario(@RequestBody Usuario usuario){
        boolean valido = usuarioService.validarUsuario(usuario);
        if(valido){
            return ResponseEntity.ok("Usuario válido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o clave incorrecta");
        }
    }


}
