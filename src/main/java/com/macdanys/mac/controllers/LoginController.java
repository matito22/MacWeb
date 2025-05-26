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
    @Autowired
    UsuarioService usuarioService;


   @PostMapping("/crear")
    public ResponseEntity<?> crearUsuarioController(@RequestBody Usuario usuario){
    try {
        Usuario nuevoUsuario = usuarioService.cUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario); // 201 Created
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Error al crear el usuario: ");
    }
}
    
   @PostMapping("/validar")
    public ResponseEntity<String> validarUsuario(@RequestBody Usuario usuario) {// request body, transforma lo que le paso en un usuario para chequearlo en formato json
    boolean resultado = usuarioService.validarUsuario(usuario.getNombreDeUsuario(), usuario.getPassword());
    if (resultado) {
        return ResponseEntity.ok("Usuario válido");
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o clave incorrecta");
    }
}

    

}
