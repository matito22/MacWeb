package com.macdanys.mac.controllers;
import com.macdanys.mac.dto.UsuarioDTO;
import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.TipoDeVajilla;
import com.macdanys.mac.entitys.Vajilla;
import com.macdanys.mac.services.AlquilerService;
import com.macdanys.mac.services.UsuarioService;
import com.macdanys.mac.services.VajillaService;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/nuevaVajilla")
public class CrearVajillaController {

    @Autowired
    VajillaService vajillaService;


    @PostMapping("/crearVajilla")
    public ResponseEntity<?>crearVajilla(@RequestParam String modelo,@RequestParam String color,@RequestParam String tamaño,@RequestParam Float precioIndividual,@RequestParam TipoDeVajilla tipoDeVajilla) {
       
        if(modelo.isBlank() || color.isBlank() || tamaño.isBlank()){
            modelo=null;
            color=null;
            tamaño=null;
        }
        if(precioIndividual.isNaN() || tipoDeVajilla == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Precio o tipo de vajilla incorrecto");
        }
        
        
        Optional<Vajilla> usOptional=vajillaService.findByTipoDeVajilla(tipoDeVajilla);
        if(usOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Ya existe este tipo de vajilla");
        }

        Vajilla vajilla=new Vajilla (modelo,color,precioIndividual,tamaño,tipoDeVajilla);
        vajillaService.cVajilla(vajilla);
        return ResponseEntity.ok().body("Vajilla agregada");

    }
    




}
