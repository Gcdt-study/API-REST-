package com.grupoA.grupoA_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "platos")
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ingredientePrincipal;
    private String foto;

    public Plato() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIngredientePrincipal() { return ingredientePrincipal; }
    public void setIngredientePrincipal(String ingredientePrincipal) { this.ingredientePrincipal = ingredientePrincipal; }

    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }
}
