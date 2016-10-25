

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.resources;

/**
 * Servlet implementation class InsertslotServlet
 */
@WebServlet("/InsertslotServlet")
public class InsertslotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertslotServlet() {
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
		String name=request.getParameter("name");
		String date=request.getParameter("date");
		
		HttpSession session = request.getSession(false);
		String netid=(String)session.getAttribute("NETID");
		resources r=new resources();

		r.setDate(date);
		r.setName(name);
		ArrayList<String> a1=r.bookslot(name, date);
		System.out.println(a1);
		request.setAttribute("slot", a1);
    	RequestDispatcher rd1=request.getRequestDispatcher("reserveresource2.jsp");
    	rd1.forward(request, response);
		
		doGet(request, response);
		
	}

}
