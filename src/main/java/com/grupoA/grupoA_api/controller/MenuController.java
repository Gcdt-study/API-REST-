package com.grupoA.grupoA_api.controller;

import com.grupoA.grupoA_api.entity.Menu;
import com.grupoA.grupoA_api.entity.Menu;
import com.grupoA.grupoA_api.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    //Atributos
    private final MenuService menuService;

    //Constructor
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    //region GET
    /**
     * @return Devuelve todos los menus
     */
    @GetMapping
    public List<Menu> getMenus() {
        return menuService.listarTodos();
    }

    /**
     * @param id
     * @return Devuelve un único menú o nada
     */
    @GetMapping("/{id}")
    public Optional<Menu> getMenuPorId(@PathVariable Long id){
        return menuService.buscarPorId(id);
    }
    //endregion

    //region POST
    /**
     * @param menu
     * @return Inserta un menú en la BBDD y devuelve dicho menú
     */
    @PostMapping
    public Menu setMenu(@RequestBody Menu menu) {
        return menuService.guardar(menu);
    }
    //endregion

    //region PUT
    @PutMapping("/{id}")
    public Menu reescribirMenu(@PathVariable Long id, @RequestBody Menu menu) {
        Optional<Menu> empleadoExistente = menuService.buscarPorId(id);

        if (empleadoExistente.isPresent()) {
            //Esta línea modifica la instancia de menú que recibe y se asegura de que su id sea el del menú
            //que ya existía, lo que machacará la información y no crear un registro nuevo
            menu.setId(id);
            return menuService.guardar(menu);
        }
        return null;
    }
    //endregion

    //region PATCH
    @PatchMapping("/{id}")
    public Menu modificarCampoMenu(@PathVariable Long id, @RequestBody Map<String, Map<String, Object>> campos) {
        return menuService.actualizarDatosConcretos(id, campos);
    }
    //endregion


    //region DELETE
    @DeleteMapping("/{id}")
    public Menu eliminarMenu(@PathVariable Long id) {
        Optional<Menu> menu = menuService.buscarPorId(id);

        if (menu.isPresent()) {
            menuService.eliminar(id);
            return menu.get();  // Devuelve el menú que se eliminó
        }

        return null;  // No existe
    }
    //endregion
}
