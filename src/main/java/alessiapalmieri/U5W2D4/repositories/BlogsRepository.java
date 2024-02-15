package alessiapalmieri.U5W2D4.repositories;

import alessiapalmieri.U5W2D4.entities.Author;
import alessiapalmieri.U5W2D4.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
    List<Blogpost> findByAuthor(Author author);
}
