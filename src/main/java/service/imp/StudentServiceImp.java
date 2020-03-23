package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Student;
import mapper.StudentMapper;
import service.StudentService;

@Service
//@Transactional//事务注解 声明在类上时，此类中的每一个方法就是一个事务
public class StudentServiceImp implements StudentService {
	//@Transactional 遇到异常以后回滚，所以不去取处理掉异常
	@Autowired
	private StudentMapper sm;

	
	public List<Student> queryStudent() {
		System.out.println("service_queryStudent");
		List<Student> list = sm.queryStudent();
		return list;
	}

	@Transactional//事务注解 声明在方法，此方法就是一个事务  
	public Integer insertStudent(Student stu) {
		System.out.println("service_insertStudent");
		//第一个操作
		Integer num = sm.insertStudent(stu);
		//第二个操作：模拟第二个操作失败
		//Integer num = sm.insertStudent(stu);
		if(num>0) {
			throw new RuntimeException("第二个操作失败");
		}
		return num;
	}

}
