package Dgroup.kanri.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import Dgroup.kanri.model.Teacher;
 
public interface TeacherRepository extends JpaRepository<Teacher, String> {
    
}