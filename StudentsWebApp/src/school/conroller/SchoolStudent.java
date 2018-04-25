package school.conroller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school.models.Student;
import school.services.StudentService;

/**
 * Servlet implementation class SchoolStudent
 */
@WebServlet("/SchoolStudent")
public class SchoolStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	StudentService ss;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> studentList = (List<Student>) ss.getStudent();
		request.setAttribute("studentList", studentList);

		RequestDispatcher r = request.getRequestDispatcher("WEB-INF/res/showStudents.jsp");
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
