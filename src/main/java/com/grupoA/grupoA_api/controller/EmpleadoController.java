package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Empleado;
import com.grupoA.grupoA_api.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    //Atributos
    private final EmpleadoService empleadoService;

    //Constructor
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    //region GET
    /**
     * @return Devuelve todos los empleados
     */
    @GetMapping
    public List<Empleado> getEmpleados() {
        return empleadoService.listarTodos();
    }

    /**
     * @param id
     * @return Devuelve un único empleado o nada
     */
    @GetMapping("/{id}")
    public Optional<Empleado> getEmpleadoPorId(@PathVariable Long id){
        return empleadoService.buscarPorId(id);
    }
    //endregion

    //region POST
    /**
     * @param empleado
     * @return Inserta un empleado en la BBDD y devuelve dicho empleado
     */
    @PostMapping
    public Empleado setEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardar(empleado);
    }
    //endregion

    //region PUT
    @PutMapping("/{id}")
    public Empleado reescribirEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        Optional<Empleado> empleadoExistente = empleadoService.buscarPorId(id);

        if (empleadoExistente.isPresent()) {
            //Esta línea modifica la instancia de empleado que recibe y se asegura de que su id sea el del empleado
            //que ya existía, lo que machacará la información y no crear un registro nuevo
            empleado.setId(id);
            return empleadoService.guardar(empleado);
        }
        return null;
    }
    //endregion

    //region DELETE
    @DeleteMapping
    public Empleado eliminarEmpleado(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoService.buscarPorId(id);

        if (empleado.isPresent()) {
            empleadoService.eliminar(id);
            return empleado.get();  // Devuelve el empleado que se eliminó
        }

        return null;  // No existe
    }
    //endregion
}
