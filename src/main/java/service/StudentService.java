package service;

import java.util.List;

import entity.Student;

public interface StudentService {
	public List<Student> queryStudent();
	public Integer insertStudent(Student stu);
}
