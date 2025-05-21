package com.macdanys.mac.controllers;

import com.macdanys.mac.entitys.Alquiler;
import com.macdanys.mac.entitys.Estado;
import com.macdanys.mac.services.AlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@Controller
@RequestMapping("/alquileres")
public class AlquileresActivosController {

    @Autowired
    private AlquilerService alquilerService;

    @GetMapping("/activos")
    public String mostrarAlquileresActivos(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate desde,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate hasta,
            Model model
    ) {
        List<Alquiler> alquileres;

        if (desde != null && hasta != null) {
            alquileres = alquilerService.findByFechaComienzoBetweenOrEstado(desde, hasta, Estado.ACTIVO);
        } else {
            alquileres = alquilerService.traerPorEstado(Estado.ACTIVO);
        }

        model.addAttribute("alquileres", alquileres);
        return "alquileres/activos"; // Thymeleaf: src/main/resources/templates/alquileres/activos.html
    }

   @PostMapping("/finalizar/{id}")//Esta anotación indica que este método responde a una petición HTTP POST con una URL, le paso el id del alquiler a finalizar
    public String finalizarAlquiler(@PathVariable("id") Integer id) {//@PathVariable("id") vincula el valor de la URL ({id}) con la variable del método
    alquilerService.modificarEstadoAlquiler(Estado.FINALIZADO, id);
    return "redirect:/alquileres/activos";
}
}