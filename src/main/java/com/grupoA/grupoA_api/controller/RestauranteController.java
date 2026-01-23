package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Restaurante;
import com.grupoA.grupoA_api.service.RestauranteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class RestauranteController {
    //Atributos
    private final RestauranteService restauranteService;

    //Constructor
    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }
    /*
    //region GET
    @GetMapping
    public Optional<Restaurante> getRestaurante() {
        return restauranteService.
    }*/
    //endregion
}
