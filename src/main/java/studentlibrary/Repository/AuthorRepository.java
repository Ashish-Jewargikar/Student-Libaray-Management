package studentlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import studentlibrary.Entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
