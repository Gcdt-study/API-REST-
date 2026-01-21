package com.grupoA.grupoA_api.service;

import  com.grupoA.grupoA_api.entity.Plato;
import  com.grupoA.grupoA_api.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {
    @Autowired
    private PlatoRepository repository;

    public List<Plato> listarTodos() { return repository.findAll(); }
    public Optional<Plato> buscarPorId(Long id) { return repository.findById(id); }
    public Plato guardar(Plato p) { return repository.save(p); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
