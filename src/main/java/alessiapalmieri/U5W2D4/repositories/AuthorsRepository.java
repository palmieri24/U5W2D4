package alessiapalmieri.U5W2D4.repositories;

import alessiapalmieri.U5W2D4.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}