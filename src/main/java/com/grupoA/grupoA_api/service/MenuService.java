package com.grupoA.grupoA_api.service;

import  com.grupoA.grupoA_api.entity.Menu;
import  com.grupoA.grupoA_api.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    @Autowired
    private MenuRepository repository;

    public List<Menu> listarTodos() { return repository.findAll(); }
    public Optional<Menu> buscarPorId(Long id) { return repository.findById(id); }
    public Menu guardar(Menu m) { return repository.save(m); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
