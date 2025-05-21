package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión

import java.time.LocalDate;

@Entity
@Table(name="multa")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMulta;
    @Column(name="monto")
    private Float monto;
    @Column(name="fecha")
    private LocalDate fecha;

    @OneToOne
    @JoinColumn(name="alquiler_id",nullable = false)
    private Alquiler alquiler;

    public Multa() {}

    public Multa(Integer idMulta, Float monto, LocalDate fecha, Alquiler alquiler) {
        this.idMulta = idMulta;
        this.monto = monto;
        this.fecha = fecha;
        this.alquiler = alquiler;
    }

    public Multa(Float monto, LocalDate fecha, Alquiler alquiler) {
        this.monto = monto;
        this.fecha = fecha;
        this.alquiler = alquiler;
    }


    public Integer getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(Integer idMulta) {
        this.idMulta = idMulta;
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
        return "Multa{" +
                "idMulta=" + idMulta +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", alquiler=" + alquiler +
                '}';
    }
}
