package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Bebida;
import com.grupoA.grupoA_api.service.BebidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {
    //Atributos
    private final BebidaService bebidaService;

    //Constructor
    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    //region GET
    /**
     * @return Devuelve todas las bebidas
     */
    @GetMapping
    public List<Bebida> getBebidas() {
        return bebidaService.listarTodos();
    }

    /**
     * @param id
     * @return Devuelve una única bebida o nada
     */
    @GetMapping("/{id}")
    public Optional<Bebida> getBebidaPorId(@PathVariable Long id) {
        return bebidaService.buscarPorId(id);
    }
    //endregion

    //region POST
    /**
     * @param bebida
     * @return Inserta una bebida en la BBDD y devuelve dicha bebida
     */
    @PostMapping
    public Bebida setBebida(@RequestBody Bebida bebida) {
        return bebidaService.guardar(bebida);
    }
    //endregion
}
