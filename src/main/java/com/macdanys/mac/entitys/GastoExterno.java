package com.macdanys.mac.entitys;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="gastoexterno")
public class GastoExterno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGastoExterno;

    @Column(name="descripcion",nullable = false)
    private String descripcion;

    @Column(name="monto",nullable = false)
    private Float monto;

    @Column(name="fecha",nullable = false)
    private LocalDate fecha;

    @ManyToOne//Cada gasto externo pertenece a un alquiler.
    @JoinColumn(name = "alquiler_id", nullable = false)
    private Alquiler alquiler;


    public GastoExterno() {}

    public GastoExterno(int idGastoExterno, String descripcion, Float monto, LocalDate fecha, Alquiler alquiler) {
        this.idGastoExterno = idGastoExterno;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.alquiler = alquiler;
    }

    public GastoExterno(String descripcion, Float monto, LocalDate fecha, Alquiler alquiler) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.alquiler = alquiler;
    }

    public int getIdGastoExterno() {
        return idGastoExterno;
    }

    public void setIdGastoExterno(int idGastoExterno) {
        this.idGastoExterno = idGastoExterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        return "GastoExterno{" +
                "idGastoExterno=" + idGastoExterno +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", alquiler=" + alquiler +
                '}';
    }
}
