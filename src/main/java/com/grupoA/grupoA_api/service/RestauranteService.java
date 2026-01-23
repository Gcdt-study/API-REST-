package com.grupoA.grupoA_api.service;

import com.grupoA.grupoA_api.entity.Restaurante;
import com.grupoA.grupoA_api.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository repository;

    //SOLO GUARDAMOS INFO DE 1 RESTAURANTE, EL NUESTRO
    public Restaurante obtenerDatos() {
        return repository.findById(1L).orElse(null);
    }

    public Restaurante actualizarDatos(Restaurante r) {
        r.setId(1L);
        return repository.save(r);
    }
}
