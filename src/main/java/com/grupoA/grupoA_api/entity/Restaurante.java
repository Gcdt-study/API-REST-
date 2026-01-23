package com.grupoA.grupoA_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurantes")
public class Restaurante {
    @Id
    private Long id;

    private String nombre;
    private String ubicacion;
    private Integer mesas;

    public Restaurante() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public Integer getMesas() { return mesas; }
    public void setMesas(Integer mesas) { this.mesas = mesas; }
}
