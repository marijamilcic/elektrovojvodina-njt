package jsf.bean;

import jsf.model.Student;
import jsf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name="studentBean")
@Scope
@Component
public class StudentBean {
	
	@Autowired
	private StudentService studentService;
	private Student student;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StudentBean(){
		student = new Student();
	}

	public void addStudent(){
		studentService.add(student);
		student = new Student();
	}

	public List<Student> getStudentList(){
		//return new ArrayList<Student>();
		return studentService.getAll();
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
