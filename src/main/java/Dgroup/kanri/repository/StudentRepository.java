package Dgroup.kanri.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Dgroup.kanri.model.Student;
 
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
