package jsf.dao.impl;

import jsf.dao.StudentDao;
import jsf.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Student student) {
		sessionFactory.getCurrentSession().persist(student);
	}

	@Override
	public List<Student> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from jsf.model.Student ").list();
	}
	
}