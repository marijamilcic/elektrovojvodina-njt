package jsf.service;

import jsf.domain.Activity;
import jsf.model.Student;

import java.util.List;

public interface StudentService {
	public void add(Student student);
	public List<Student> getAll();
}
