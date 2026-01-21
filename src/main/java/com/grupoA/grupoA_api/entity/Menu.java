package com.grupoA.grupoA_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_primer_plato")
    private Plato primerPlato;

    @ManyToOne
    @JoinColumn(name = "id_segundo_plato")
    private Plato segundoPlato;

    @ManyToOne
    @JoinColumn(name = "id_postre")
    private Plato postre;

    @ManyToOne
    @JoinColumn(name = "id_bebida")
    private Bebida bebida;

    public Menu() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Plato getPrimerPlato() { return primerPlato; }
    public void setPrimerPlato(Plato primerPlato) { this.primerPlato = primerPlato; }

    public Plato getSegundoPlato() { return segundoPlato; }
    public void setSegundoPlato(Plato segundoPlato) { this.segundoPlato = segundoPlato; }

    public Plato getPostre() { return postre; }
    public void setPostre(Plato postre) { this.postre = postre; }

    public Bebida getBebida() { return bebida; }
    public void setBebida(Bebida bebida) { this.bebida = bebida; }
}
