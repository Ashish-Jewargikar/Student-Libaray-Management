package studentlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import studentlibrary.Entity.LibraryCard;

@Repository
public interface CardRepository extends JpaRepository<LibraryCard, Integer> {

}
