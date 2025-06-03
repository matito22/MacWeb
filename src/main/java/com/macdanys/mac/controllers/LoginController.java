package com.macdanys.mac.controllers;

import com.macdanys.mac.dto.UsuarioDTO;
import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
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
@RequestMapping("/api/login") // ruta base
public class LoginController {
    @Autowired
    UsuarioService usuarioService;

    //Login exitoso
    @PostMapping("/validar")
    public ResponseEntity<String> validarLogin(@RequestBody Usuario usuario) {// request body, transforma lo que le paso en un usuario para chequearlo en formato json
    boolean resultado = usuarioService.validarUsuario(usuario.getNombreDeUsuario(), usuario.getPassword());
    if (resultado) {
        return ResponseEntity.ok("Usuario válido");
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o clave incorrecta");
    }
    }






}
