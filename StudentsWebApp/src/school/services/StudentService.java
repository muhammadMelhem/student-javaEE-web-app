package school.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import school.models.Student;

/**
 * Session Bean implementation class StudentService
 */
@Stateless
@LocalBean
public class StudentService {

	@PersistenceContext(unitName = "StudentsWebApp")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	public void addStudent(Student s) {
		em.persist(s);
	}

	public List<Student> getStudent() {

		TypedQuery<Student> student = em.createQuery("SELECT s FROM Student s", Student.class);
		List<Student> students = student.getResultList();

		return students;

	}

}
