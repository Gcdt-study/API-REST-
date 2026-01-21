package  com.grupoA.grupoA_api.repository;
import  com.grupoA.grupoA_api.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long> {}
