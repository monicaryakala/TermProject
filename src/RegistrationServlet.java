

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.userregistration;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Netid = request.getParameter("NetID");
		String firstname = request.getParameter("firstname");
		
		String lastname = request.getParameter("Lastname");
		String password = request.getParameter("pwd");
		String role = request.getParameter("Role");
		String year = request.getParameter("yearofjoiningprogram");
		String program = request.getParameter("Program");
		
		userregistration r = new userregistration();
	    r.setNetID(Netid);
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setpwd(password);
		r.setRole(role);
	    r.setYearofjoining(year);
		r.setProgram(program);
		
		
		int u = r.userRegistration();
		if(u!=0)
		{
			
			
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
		else{
			request.setAttribute("error", "Not Registered!!");
			request.getRequestDispatcher("RegistrationPage.jsp").forward(request, response);
			
		}
		
		System.out.println(Netid);
		//System.out.println(lastname);
		//System.out.println(firstname);
		//System.out.println(role);
		//System.out.println(year);
		//System.out.println(program);
		doGet(request, response);
	}

}
