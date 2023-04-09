package studentlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import studentlibrary.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
