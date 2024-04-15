package Dgroup.kanri.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import Dgroup.kanri.model.Teacher;
 
public interface Class_numRepository extends JpaRepository<Teacher, String> {
    
}