package  com.grupoA.grupoA_api.repository;
import  com.grupoA.grupoA_api.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {}
