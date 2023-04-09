package studentlibrary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import studentlibrary.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);  // custom search based on attribute
    List<Student> findByAge(int age);
}
