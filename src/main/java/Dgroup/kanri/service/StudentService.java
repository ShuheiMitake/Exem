package Dgroup.kanri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dgroup.kanri.model.Student;
import Dgroup.kanri.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // 全生徒のリストを取得するメソッド
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    // 新しい生徒または既存の生徒を保存するメソッド
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    // 生徒を削除するメソッド
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
