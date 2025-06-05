package com.macdanys.mac.dto;

import com.macdanys.mac.entitys.TipoDeVajilla;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class VajillaDTO {
    

    private Integer idVajilla;

    @Column(name = "modelo")   private String modelo;

    private String color;

    private String tamaño;

    private Float precioIndividual;

  
    private Integer idtipoDeVajilla;


    public Integer getIdVajilla() {
        return idVajilla;
    }


    public void setIdVajilla(Integer idVajilla) {
        this.idVajilla = idVajilla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(Float precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public Integer getidTipoDeVajilla() {
        return idtipoDeVajilla;
    }

    public void setTipoDeVajilla(Integer idtipoDeVajilla) {
        this.idtipoDeVajilla = idtipoDeVajilla;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
