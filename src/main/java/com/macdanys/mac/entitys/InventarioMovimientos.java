package com.macdanys.mac.entitys;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "inventariomovimientos")
public class InventarioMovimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que se autoincrementa el valor por la BD
    private int idInventario;

    @ManyToOne // Relación Muchos a Uno con Vajilla, muchos movimientos estan asociados a una vajilla, pero una vajilla puede tener muchos movimientos
    @JoinColumn(name = "vajilla_id", referencedColumnName = "idVajilla") // Relaciona con la columna vajilla_id en la BD
    private Vajilla vajilla;

    private int cantidad;

    
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "usuario")
    private String usuario;

    @Enumerated(EnumType.STRING) // Para almacenar el valor del enum en la BD como un String
    private TipoMovimiento tipoMovimiento;
    private LocalDate fechaDeMovimiento;

    // Relación ManyToOne con Alquiler (con ON DELETE SET NULL)
    @ManyToOne(fetch = FetchType.LAZY)//. Esto es lo que permite la carga perezosa (Lazy Loading): la entidad Alquiler solo se recupera de la base de datos cuando realmente la necesitas.
    @JoinColumn(name = "alquiler_id", referencedColumnName = "idAlquiler", nullable = true)
    private Alquiler alquiler;


    public InventarioMovimientos() {}

    
    public InventarioMovimientos(int idInventario, Vajilla vajilla, int cantidad, String descripcion, String usuario,
            TipoMovimiento tipoMovimiento, LocalDate fechaDeMovimiento, Alquiler alquiler) {
        this.idInventario = idInventario;
        this.vajilla = vajilla;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.tipoMovimiento = tipoMovimiento;
        this.fechaDeMovimiento = fechaDeMovimiento;
        this.alquiler = alquiler;
    }




    public int getIdInventario() {
        return idInventario;
    }


    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }


    public Vajilla getVajilla() {
        return vajilla;
    }


    public void setVajilla(Vajilla vajilla) {
        this.vajilla = vajilla;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }


    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }


    public LocalDate getFechaDeMovimiento() {
        return fechaDeMovimiento;
    }


    public void setFechaDeMovimiento(LocalDate fechaDeMovimiento) {
        this.fechaDeMovimiento = fechaDeMovimiento;
    }


    public Alquiler getAlquiler() {
        return alquiler;
    }


    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }




    @Override
    public String toString() {
        return "InventarioMovimientos [idInventario=" + idInventario + ", vajilla=" + vajilla + ", cantidad=" + cantidad
                + ", descripcion=" + descripcion + ", usuario=" + usuario + ", tipoMovimiento=" + tipoMovimiento
                + ", fechaDeMovimiento=" + fechaDeMovimiento + ", alquiler=" + alquiler + "]";
    }

    
   
    


}
