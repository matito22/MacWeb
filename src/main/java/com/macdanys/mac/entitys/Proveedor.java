package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión


@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproveedor;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "costo_adquisicion")
    private Float costoAdquisicion;

    public Proveedor() {}

    public Proveedor(Integer idproveedor, String nombre, String contacto, Float costoAdquisicion) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.costoAdquisicion = costoAdquisicion;
    }

    public Proveedor(String nombre, String contacto, Float costoAdquisicion) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.costoAdquisicion = costoAdquisicion;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Float getCostoAdquisicion() {
        return costoAdquisicion;
    }

    public void setCostoAdquisicion(Float costoAdquisicion) {
        this.costoAdquisicion = costoAdquisicion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idproveedor=" + idproveedor +
                ", nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", costoAdquisicion=" + costoAdquisicion +
                '}';
    }
}
