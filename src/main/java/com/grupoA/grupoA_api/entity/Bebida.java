package com.grupoA.grupoA_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bebidas")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String foto;

    public Bebida() {}

    public Bebida(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }

}
