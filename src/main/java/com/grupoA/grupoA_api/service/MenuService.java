package com.grupoA.grupoA_api.service;

import com.grupoA.grupoA_api.entity.Menu;
import com.grupoA.grupoA_api.repository.MenuRepository;
import com.grupoA.grupoA_api.repository.PlatoRepository;
import com.grupoA.grupoA_api.repository.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MenuService {
    @Autowired
    private MenuRepository repository;

    @Autowired
    private PlatoRepository platoRepository;

    @Autowired
    private BebidaRepository bebidaRepository;

    public List<Menu> listarTodos() {
        return repository.findAll();
    }

    public Optional<Menu> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Menu guardar(Menu m) {
        return repository.save(m);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    /**
     * Actualiza parcialmente un menú existente.
     * Solo modifica los campos que se envían en el Map.
     *
     * @param id ID del menú a actualizar
     * @param campos Map con los campos a actualizar. Cada campo debe contener un Map con el "id" de la entidad relacionada
     * @return El menú actualizado o null si no existe
     */
    public Menu actualizarDatosConcretos(Long id, Map<String, Map<String, Object>> campos) {
        Optional<Menu> menuExistente = repository.findById(id);

        if (menuExistente.isPresent()) {
            Menu menu = menuExistente.get();

            // Actualizar primer plato si viene en la petición
            if (campos.containsKey("primerPlato")) {
                Map<String, Object> mapaPlato = campos.get("primerPlato");
                if (mapaPlato.containsKey("id")) {
                    Long idPlato = Long.valueOf(mapaPlato.get("id").toString());
                    platoRepository.findById(idPlato).ifPresent(menu::setPrimerPlato);
                }
            }

            // Actualizar segundo plato si viene en la petición
            if (campos.containsKey("segundoPlato")) {
                Map<String, Object> mapaPlato = campos.get("segundoPlato");
                if (mapaPlato.containsKey("id")) {
                    Long idPlato = Long.valueOf(mapaPlato.get("id").toString());
                    platoRepository.findById(idPlato).ifPresent(menu::setSegundoPlato);
                }
            }

            // Actualizar postre si viene en la petición
            if (campos.containsKey("postre")) {
                Map<String, Object> mapaPlato = campos.get("postre");
                if (mapaPlato.containsKey("id")) {
                    Long idPlato = Long.valueOf(mapaPlato.get("id").toString());
                    platoRepository.findById(idPlato).ifPresent(menu::setPostre);
                }
            }

            // Actualizar bebida si viene en la petición
            if (campos.containsKey("bebida")) {
                Map<String, Object> mapaBebida = campos.get("bebida");
                if (mapaBebida.containsKey("id")) {
                    Long idBebida = Long.valueOf(mapaBebida.get("id").toString());
                    bebidaRepository.findById(idBebida).ifPresent(menu::setBebida);
                }
            }

            return repository.save(menu);
        }
        return null;
    }
}