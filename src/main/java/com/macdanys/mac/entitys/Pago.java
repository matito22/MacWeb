package com.macdanys.mac.entitys;

import java.time.LocalDate;
import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;

    @ManyToOne
    @JoinColumn(name = "id_alquiler")//Esta relacion es muchos a uno porque un alquiler puede tener varios tipos de pago, pero un pago pertenece siempre a un solo alquiler
    private Alquiler alquiler;//No es necesario que en la entidad alquiler exista una relacion con pago, ya que con el ID de alquiler, podemos obtener los pagos del mismo
    @Column(name="monto")
    private Float monto;
    @Column(name="monto_adelantado")
    private Float montoAdelantado;
    @Column(name="tipo_pago")
    private String tipoPago;
    @Column(name="fecha_de_pago")
    private LocalDate fechaDePago;
    @Column(name="fecha_de_pago_adelantado")
    private LocalDate fechaDePagoAdelantado;


    public Pago(){}

    public Pago(Alquiler alquiler, Float monto, Float montoAdelantado, String tipoPago, LocalDate fechaDePago, LocalDate fechaDePagoAdelantado) {
        this.alquiler = alquiler;
        this.monto = monto;
        this.montoAdelantado = montoAdelantado;
        this.tipoPago = tipoPago;
        this.fechaDePago = fechaDePago;
        this.fechaDePagoAdelantado = fechaDePagoAdelantado;
    }

    public Pago(Integer idPago, Alquiler alquiler, Float monto, Float montoAdelantado, String tipoPago, LocalDate fechaDePago, LocalDate fechaDePagoAdelantado) {
        this.idPago = idPago;
        this.alquiler = alquiler;
        this.monto = monto;
        this.montoAdelantado = montoAdelantado;
        this.tipoPago = tipoPago;
        this.fechaDePago = fechaDePago;
        this.fechaDePagoAdelantado = fechaDePagoAdelantado;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getMontoAdelantado() {
        return montoAdelantado;
    }

    public void setMontoAdelantado(Float montoAdelantado) {
        this.montoAdelantado = montoAdelantado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public LocalDate getfechaDePagoAdelantado() {
        return fechaDePagoAdelantado;
    }

    public void setfechaDePagoAdelantado(LocalDate fechaDePagoAdelantado) {
        this.fechaDePagoAdelantado = fechaDePagoAdelantado;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago=" + idPago +
                ", alquiler=" + alquiler +
                ", monto=" + monto +
                ", montoAdelantado=" + montoAdelantado +
                ", tipoPago='" + tipoPago + '\'' +
                ", fechaDePago=" + fechaDePago +
                ", fehcaDePagoAdelantado=" + fechaDePagoAdelantado +
                '}';
    }
}
