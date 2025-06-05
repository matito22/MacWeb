package com.macdanys.mac.controllers;
import com.macdanys.mac.dto.UsuarioDTO;
import com.macdanys.mac.dto.VajillaDTO;
import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.entitys.TipoDeUsuario;
import com.macdanys.mac.entitys.TipoDeVajilla;
import com.macdanys.mac.entitys.Vajilla;
import com.macdanys.mac.services.AlquilerService;
import com.macdanys.mac.services.TipoDeVajillaService;
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
    @Autowired
    TipoDeVajillaService tipoDeVajillaService;


    @PostMapping("/crearVajilla")
    public ResponseEntity<?>crearVajilla(@RequestBody VajillaDTO vajillaDTO) {
       String modelo=vajillaDTO.getModelo();
       String color=vajillaDTO.getColor();
       Float precioIndividual=vajillaDTO.getPrecioIndividual();
       String tamaño=vajillaDTO.getTamaño();
      
       Optional<TipoDeVajilla> tOptional=tipoDeVajillaService.traerPorId(vajillaDTO.getidTipoDeVajilla());




        if(modelo.isBlank()){
            modelo=null;
        }

        if(color.isBlank()){
            color=null;
        }
        if(tamaño.isBlank()){
            tamaño=null;
        }


        if(!tOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Tipo de vajilla incorrecto");
        }
        if(precioIndividual == null || precioIndividual.isNaN()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("El precio no puede estar vacio");
        }
        
        
        Optional<Vajilla> usOptional=vajillaService.findByTipoDeVajilla(tOptional.get());
        if(usOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Ya existe este tipo de vajilla");
        }

        Vajilla vajilla=new Vajilla (modelo,color,precioIndividual,tamaño,tOptional.get());
        vajillaService.cVajilla(vajilla);
        return ResponseEntity.ok().body("Vajilla agregada");

    }
    




}
