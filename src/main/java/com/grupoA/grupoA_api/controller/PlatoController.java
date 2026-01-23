package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Plato;
import com.grupoA.grupoA_api.service.PlatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/platos")
public class PlatoController {
    //Atributos
    private final PlatoService platoService;

    //Constructor
    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    //region GET
    /**
     * @return Devuelve todos los platos
     */
    @GetMapping
    public List<Plato> getPlatos() {
        return platoService.listarTodos();
    }

    /**
     * @param id
     * @return Devuelve un único plato o nada
     */
    @GetMapping("/{id}")
    public Optional<Plato> getPlatoPorId(@PathVariable Long id) {
        return platoService.buscarPorId(id);
    }
    //endregion

    //region POST
    /**
     * @param plato
     * @return Inserta un plato en la BBDD y devuelve dicho plato
     */
    @PostMapping
    public Plato setPlato(@RequestBody Plato plato) {
        return platoService.guardar(plato);
    }
    //endregion
}
