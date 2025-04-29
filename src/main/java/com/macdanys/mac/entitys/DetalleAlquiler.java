package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión


//Esta entidad funciona como tabla intermedia entre el alquiler y la vajilla disponible, almacena que vajillas se alquilaron en determinado alquiler, cantidad y precio

@Entity//Indica que esta clase es una entidad JPA, es decir, representa una tabla en la base de datos.
@Table(name="detalle_alquiler")// Este es el nombre con el que figura en la BD
public class DetalleAlquiler {

    @Id//Marca el campo idDetalle_Alquiler como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que se autoincrementa el valor por la BD
    private int idDetalle_Alquiler;

    private Integer cantidad;
    private Float precioUnitario;

    @ManyToOne//Cada detalle pertenece a un alquiler.
    @JoinColumn(name="alquiler_id",nullable = false)// La columna alquiler_id en la tabla detalle_alquiler (o el nombre que uses) será la clave foránea que referencia a alquiler.idAlquiler.
    private Alquiler alquiler;//nullable = false: Opcional, según si querés permitir que un detalle exista sin alquiler (en general no).

    @ManyToOne
    @JoinColumn(name = "vajilla_id",nullable = false)// Lo mismo que la relacion anterior
    private Vajilla vajilla;

    public DetalleAlquiler() {}

    public DetalleAlquiler(int idDetalle_Alquiler, Integer cantidad, Float precioUnitario, Alquiler alquiler, Vajilla vajilla) {
        this.idDetalle_Alquiler = idDetalle_Alquiler;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.alquiler = alquiler;
        this.vajilla = vajilla;
    }
    public DetalleAlquiler(Integer cantidad, Float precioUnitario, Alquiler alquiler, Vajilla vajilla) {

        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.alquiler = alquiler;
        this.vajilla = vajilla;
    }

    public DetalleAlquiler(Integer cantidad, Float precioUnitario,Vajilla vajilla) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.vajilla = vajilla;
    }




    public int getIdDetalle_Alquiler() {
        return idDetalle_Alquiler;
    }

    public void setIdDetalle_Alquiler(int idDetalle_Alquiler) {
        this.idDetalle_Alquiler = idDetalle_Alquiler;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Vajilla getVajilla() {
        return vajilla;
    }

    public void setVajilla(Vajilla vajilla) {
        this.vajilla = vajilla;
    }

    @Override
    public String toString() {
        return "Detalle_Alquiler{" +
                "idDetalle_Alquiler=" + idDetalle_Alquiler +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", vajilla=" + vajilla.getTipoDeVajilla().getNombreTipoDeVajilla() +
                '}';
    }
}
