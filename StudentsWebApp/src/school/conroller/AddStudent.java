package school.conroller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school.models.Gender;
import school.models.Student;
import school.models.StudentClass;
import school.services.StudentService;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	StudentService ss;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher r = request.getRequestDispatcher("WEB-INF/res/Addstudent.jsp");
		r.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String fName =request.getParameter("first-name");
		String lName =request.getParameter("last-name");
		String dateOfBirth =request.getParameter("dob");
		String gender =request.getParameter("gender");
		String studentClass =request.getParameter("student-class");
		
		
		String dateArray []= dateOfBirth.split("\\/");
		
		Calendar calender = Calendar.getInstance();
		calender.set(Calendar.YEAR, Integer.parseInt(dateArray[2]));
		calender.set(Calendar.MONTH, Integer.parseInt(dateArray[1]));
		calender.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateArray[0]));

		Date dob = calender.getTime();

		Student student = new Student();
		student.setFirstName(fName);

		student.setLastName("lName");
		
		student.setDob(dob);

		student.setGender(Gender.valueOf(gender));

		student.setStudentClass(StudentClass.valueOf(studentClass));

		ss.addStudent(student);
		
		response.sendRedirect("SchoolStudent");
		
	}
}