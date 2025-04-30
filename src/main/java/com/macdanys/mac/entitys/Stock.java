package com.macdanys.mac.entitys;

import jakarta.persistence.*; // o javax.persistence.* dependiendo de tu versión

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStock;
    private Integer cantidadDisponible;


    @OneToOne
    @JoinColumn(name = "vajilla_id",nullable = false,unique = true)
    private Vajilla vajilla;


    public Stock() {}

    public Stock(Integer idStock, Integer cantidadDisponible, Vajilla vajilla) {
        this.idStock = idStock;
        this.cantidadDisponible = cantidadDisponible;
        this.vajilla = vajilla;
    }

    public Stock(Integer cantidadDisponible, Vajilla vajilla) {
        this.cantidadDisponible = cantidadDisponible;
        this.vajilla = vajilla;
    }

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Vajilla getVajilla() {
        return vajilla;
    }

    public void setVajilla(Vajilla vajilla) {
        this.vajilla = vajilla;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "idStock=" + idStock +
                ", cantidadDisponible=" + cantidadDisponible +
                ", vajilla=" + vajilla.getIdVajilla() +
                '}';
    }
}
