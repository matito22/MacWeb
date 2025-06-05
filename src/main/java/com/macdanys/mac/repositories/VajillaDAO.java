package com.macdanys.mac.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.macdanys.mac.entitys.Usuario;
import com.macdanys.mac.entitys.TipoDeVajilla;
import com.macdanys.mac.entitys.Vajilla;
import java.util.List;
import java.util.Optional;


public interface VajillaDAO extends JpaRepository<Vajilla,Integer> {

    public Optional<Vajilla> findByTipoDeVajilla(TipoDeVajilla tipoDeVajilla);

    
} 
   
    
       




   

   
      


