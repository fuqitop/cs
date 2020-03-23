package mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
public interface StudentMapper {
	public List<Student> queryStudent();

	public Integer insertStudent(Student stu);
}
