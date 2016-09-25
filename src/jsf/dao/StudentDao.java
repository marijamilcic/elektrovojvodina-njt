package jsf.dao;

import jsf.model.Student;

import java.util.List;

public interface StudentDao {
	public void add(Student student);
	public List<Student> findAll();
}
