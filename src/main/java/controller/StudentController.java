package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Student;
import service.StudentService;

@Controller
@RequestMapping("studentController")
public class StudentController {
	@Autowired
	private StudentService ss;

	@RequestMapping("/queryStudent")
	public String queryStudent() {
		System.out.println("controller_queryStudent");
		List<Student> list = ss.queryStudent();
		for (Student student : list) {
			System.out.println(student);
		}
		return "index";
	}
	
	@RequestMapping("/insertStudent")
	public String insertStudent() {
		System.out.println("controller_insertStudent");
		Student stu=new Student();
		stu.setName("¡ı œ“Ø3");
		stu.setAge(99);
		Integer num=ss.insertStudent(stu);
		System.out.println(stu);
		return "index";
	}
}
