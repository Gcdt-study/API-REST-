package com.grupoA.grupoA_api.service;

import  com.grupoA.grupoA_api.entity.Empleado;
import com.grupoA.grupoA_api.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository repository;

    public List<Empleado> listarTodos() { return repository.findAll(); }
    public Optional<Empleado> buscarPorId(Long id) { return repository.findById(id); }
    public Empleado guardar(Empleado e) { return repository.save(e); }
    public void eliminar(Long id) { repository.deleteById(id); }
}
