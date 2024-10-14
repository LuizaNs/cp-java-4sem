package diplomaapi.repository;

import diplomaapi.model.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DiplomaRepository extends JpaRepository<Diploma, UUID> {
}
