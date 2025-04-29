package com.macdanys.mac.entitys;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
@Table(name="historial_alquileres")
public class HistorialAlquileres {

    @Id//Marca el campo idHistorialAlquiler como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que se autoincrementa el valor por la BD
    private Integer idHistorialAlquiler;

    
    private Integer idAlquiler;
    private String nombreCliente;
    private String apellidoCliente;
    private LocalDate fechaComienzo;
    private LocalDate fechaFinalizacion;
    private LocalTime horaComienzo;
    private LocalTime horaFinalizacion;
    private Integer diasAlquiler;
    private Float costoDelivery;
    private float totalAlquiler;
    private float multa;

    public HistorialAlquileres() {}

    public HistorialAlquileres(Integer idHistorialAlquiler, Integer idAlquiler, String nombreCliente,String apellidoCliente, LocalDate fechaComienzo, LocalDate fechaFinalizacion, LocalTime horaComienzo, LocalTime horaFinalizacion, Integer diasAlquiler, Float costoDelivery, float totalAlquiler, Float multa) {
        this.idHistorialAlquiler = idHistorialAlquiler;
        this.idAlquiler = idAlquiler;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente=apellidoCliente;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.horaComienzo = horaComienzo;
        this.horaFinalizacion = horaFinalizacion;
        this.diasAlquiler = diasAlquiler;
        this.costoDelivery = costoDelivery;
        this.totalAlquiler = totalAlquiler;
        this.multa = multa;
    }

    public HistorialAlquileres( Integer idAlquiler, String nombreCliente,String apellidoCliente, LocalDate fechaComienzo, LocalDate fechaFinalizacion, LocalTime horaComienzo, LocalTime horaFinalizacion, Integer diasAlquiler, Float costoDelivery, float totalAlquiler, Float multa) {
        this.idAlquiler = idAlquiler;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente=apellidoCliente;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.horaComienzo = horaComienzo;
        this.horaFinalizacion = horaFinalizacion;
        this.diasAlquiler = diasAlquiler;
        this.costoDelivery = costoDelivery;
        this.totalAlquiler = totalAlquiler;
        this.multa = multa;
    }

    public Integer getIdHistorialAlquiler() {
        return idHistorialAlquiler;
    }

    public void setIdHistorialAlquiler(Integer idHistorialAlquiler) {
        this.idHistorialAlquiler = idHistorialAlquiler;
    }

    public Integer getAlquiler() {
        return idAlquiler;
    }

    public void setAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

   

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(LocalDate fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public LocalTime getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(LocalTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public LocalTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public Integer getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(Integer diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public Float getCostoDelivery() {
        return costoDelivery;
    }

    public void setCostoDelivery(Float costoDelivery) {
        this.costoDelivery = costoDelivery;
    }

    public float getTotalAlquiler() {
        return totalAlquiler;
    }

    public void setTotalAlquiler(float totalAlquiler) {
        this.totalAlquiler = totalAlquiler;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public float getMulta() {
        return multa;
    }

    @Override
    public String toString() {
        return "HistorialAlquileres [idHistorialAlquiler=" + idHistorialAlquiler + ", idAlquiler=" + idAlquiler
                + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", fechaComienzo="
                + fechaComienzo + ", fechaFinalizacion=" + fechaFinalizacion + ", horaComienzo=" + horaComienzo
                + ", horaFinalizacion=" + horaFinalizacion + ", diasAlquiler=" + diasAlquiler + ", costoDelivery="
                + costoDelivery + ", totalAlquiler=" + totalAlquiler + ", multa=" + multa + "]";
    }

    

  
}
