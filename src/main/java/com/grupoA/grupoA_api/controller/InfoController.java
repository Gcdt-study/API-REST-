package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Bebida;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InfoController {

    @GetMapping("/informacion")
    public String comprobacion() {
        return "Hola mundo";
    }
}
