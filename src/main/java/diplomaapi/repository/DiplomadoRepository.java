package diplomaapi.repository;

import diplomaapi.model.Diplomado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiplomadoRepository extends JpaRepository<Diplomado, Long> {
}
