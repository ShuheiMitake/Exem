package Dgroup.kanri.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Dgroup.kanri.model.Student;
import Dgroup.kanri.service.StudentService;
@Controller
public class GakuseiController {
	@Autowired
    private StudentService studentService;
	// 全生徒を取得
	@GetMapping("/gakuseikanri")
	public String getAllStudents(Model model) {
		List<Student> students = studentService.getStudentList();
        model.addAttribute("students", students);
        return "gakuseikanri";
	}
	// 生徒の追加
	@GetMapping("/gakuseitouroku")
	public String showCreateStudentForm(Model model) {
        model.addAttribute("studentModel", new Student());
        return "gakuseitouroku";
    }
	@PostMapping("/gakuseitouroku")
	public String saveStudent(Model model, @ModelAttribute("studentModel") Student student) {
    	try {
			studentService.saveStudent(student);
        	return "redirect:/gakuseikanri";
    	} catch(Exception e){
        	System.out.println("エラーが発生しました：" + e.getMessage());
        	return "redirect:/gakuseitouroku";
    	}
    }
	@GetMapping("/Edit")
	public String getEdit(Model model) {
		List<Student> students = studentService.getStudentList();
        model.addAttribute("students", students);
        return "edit";
	}
	
	
}