package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Empleado;
import com.grupoA.grupoA_api.entity.Restaurante;
import com.grupoA.grupoA_api.service.RestauranteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {
    //Atributos
    private final RestauranteService restauranteService;

    //Constructor
    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    //region GET
    /**
     * @return Devuelve los datos de nuestro restaurante
     */
    @GetMapping
    public Restaurante getRestaurante() {
        return restauranteService.obtenerDatos();
    }
    //endregion

    //region PUT
    @PutMapping
    public Restaurante actualizarRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.actualizarDatos(restaurante);
    }
    //endregion
}
