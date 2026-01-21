package com.grupoA.grupoA_api.service;

import com.grupoA.grupoA_api.entity.Restaurante;
import com.grupoA.grupoA_api.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository repository;

    public List<Restaurante> listarTodos() { return repository.findAll(); }
    public Optional<Restaurante> buscarPorId(Long id) { return repository.findById(id); }
    public Restaurante guardar(Restaurante r) { return repository.save(r); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
