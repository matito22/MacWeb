package com.macdanys.mac.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vajilla")
public class Vajilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVajilla;

    @Column(name = "modelo")
    private String modelo;
    @Column(name = "color")
    private String color;
    @Column(name = "tamaño")
    private String tamaño;
    @Column(name = "precio_individual")
    private Float precioIndividual;

    @OneToOne
    @JoinColumn(name = "id_tipo_de_vajilla", nullable = false)
    private TipoDeVajilla tipoDeVajilla;

    public Vajilla() {}

    public Vajilla(Integer idVajilla, String modelo, String color,String tamaño, Float precioIndividual, TipoDeVajilla tipoDeVajilla) {
        this.idVajilla = idVajilla;
        this.modelo = modelo;
        this.color = color;
        this.tamaño =tamaño;
        this.precioIndividual = precioIndividual;
        this.tipoDeVajilla = tipoDeVajilla;
    }


    public Vajilla(String modelo, String color, Float precioIndividual,String tamaño, TipoDeVajilla tipoDeVajilla) {
        this.modelo = modelo;
        this.color = color;
        this.tamaño =tamaño;
        this.precioIndividual = precioIndividual;
        this.tipoDeVajilla = tipoDeVajilla;
    }



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

    public TipoDeVajilla getTipoDeVajilla() {
        return tipoDeVajilla;
    }

    public void setTipoDeVajilla(TipoDeVajilla tipoDeVajilla) {
        this.tipoDeVajilla = tipoDeVajilla;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Vajilla{" +
                "idVajilla=" + idVajilla +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", precioIndividual=" + precioIndividual +
                ", tipoDeVajilla=" + tipoDeVajilla +
                '}';
    }
}
