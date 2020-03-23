package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Student;
import mapper.StudentMapper;
import service.StudentService;

@Service
//@Transactional//����ע�� ����������ʱ�������е�ÿһ����������һ������
public class StudentServiceImp implements StudentService {
	//@Transactional �����쳣�Ժ�ع������Բ�ȥȡ������쳣
	@Autowired
	private StudentMapper sm;

	
	public List<Student> queryStudent() {
		System.out.println("service_queryStudent");
		List<Student> list = sm.queryStudent();
		return list;
	}

	@Transactional//����ע�� �����ڷ������˷�������һ������  
	public Integer insertStudent(Student stu) {
		System.out.println("service_insertStudent");
		//��һ������
		Integer num = sm.insertStudent(stu);
		//�ڶ���������ģ��ڶ�������ʧ��
		//Integer num = sm.insertStudent(stu);
		if(num>0) {
			throw new RuntimeException("�ڶ�������ʧ��");
		}
		return num;
	}

}
