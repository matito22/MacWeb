package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión


@Entity//Indica que esta clase es una entidad JPA, es decir, representa una tabla en la base de datos.
@Table(name= "cliente")// Este es el nombre con el que figura en la BD
public class Cliente {

    @Id//Marca el campo idCliente como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que se autoincrementa el valor por la BD
    private Integer idCliente;

    @Column(name="nombre",nullable = false)
    private String nombre;

    @Column(name="apellido",nullable = false)
    private String apellido;

    @Column(name="numeroDeTelefono",nullable = false)
    private String telefono;
    
    @Column(name="domicilio",nullable = false)
    private String domicilio;


    public Cliente(){};

    public Cliente(String nombre, String apellido, String telefono, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Cliente(Integer idCliente,String nombre, String apellido, String telefono, String domicilio) {
        this.idCliente=idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return nombre + " "+ apellido;
    }

}

