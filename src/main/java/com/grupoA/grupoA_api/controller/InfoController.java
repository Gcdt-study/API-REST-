package com.grupoA.grupoA_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InfoController {

    @GetMapping("/informacion")
    public String comprobacion() {
        return "funciona la aplicacion";
    }
}
