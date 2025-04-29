package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "alquileres")
public class Alquiler implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlquiler;

    private LocalDate fechaComienzo;
    private LocalDate fechaFinalizacion;

    private LocalTime horaComienzo;
    private LocalTime horaFinalizacion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private Integer prueba;

    private Integer diasAlquiler;
    private Float costoDelivery;
    private float totalAlquiler;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @OneToMany(mappedBy = "alquiler", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleAlquiler> listaVajillaAlquilada;

    @OneToOne
    @JoinColumn(name = "multa_id")
    private Multa multa;

    private String etiqueta;

    // Constructores, getters, setters y toString acá
}