

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String NETID=request.getParameter("NETID");
		String Password=request.getParameter("Password");
		String Role=request.getParameter("Role");
	
		
		Login l=new Login();	
		l.setNETID(NETID);
		l.setPassword(Password);
		l.setRole(Role);
		
		
		boolean c= l.userLogin();
		
		if(c)
		{
			HttpSession session =request.getSession();
			session.setAttribute("NETID", NETID);
			session.setAttribute("Role", Role);
			
		request.getRequestDispatcher("menu.jsp").forward(request, response);	
		}
		else{
			request.setAttribute("error", "Not Registered!!");
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
	}

}
