package com.macdanys.mac.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.macdanys.mac.entitys.Usuario;
import com.macdanys.mac.entitys.TipoDeVajilla;
import com.macdanys.mac.entitys.Vajilla;
import java.util.List;


public interface VajillaDAO extends JpaRepository<Vajilla,Integer> {

    public Vajilla findByTipoDeVajilla(TipoDeVajilla tipoDeVajilla);

    public List<Vajilla> traerListaVajilla();
} 
   
    
       




   

   
      


