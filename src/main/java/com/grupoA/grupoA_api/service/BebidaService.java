package com.grupoA.grupoA_api.service;

import  com.grupoA.grupoA_api.entity.Bebida;
import  com.grupoA.grupoA_api.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BebidaService {
    @Autowired
    private BebidaRepository repository;

    public List<Bebida> listarTodos() { return repository.findAll(); }
    public Optional<Bebida> buscarPorId(Long id) { return repository.findById(id); }
    public Bebida guardar(Bebida b) { return repository.save(b); }
    public void eliminar(Long id) { repository.deleteById(id); }
}