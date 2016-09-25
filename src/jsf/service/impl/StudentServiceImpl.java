package jsf.service.impl;

import jsf.dao.StudentDao;
import jsf.domain.Activity;
import jsf.model.Student;
import jsf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) {
		studentDao.add(student);
	}


	@Override
	public List<Student> getAll() {
		return studentDao.findAll();
	}

}
