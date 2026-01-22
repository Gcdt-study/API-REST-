package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Bebida;
import com.grupoA.grupoA_api.repository.BebidaRepository;
import com.grupoA.grupoA_api.service.BebidaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping
    public List<Bebida> bebidas() {
        return bebidaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Bebida> obtenerBebidas(@PathVariable Long id) {
        return bebidaService.buscarPorId(id);
    }

    @PostMapping
    public Bebida crear(@RequestBody Bebida bebida) {
        return bebidaService.guardar(bebida);
    }
}
