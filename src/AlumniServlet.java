

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Alumni;
import model.Courses;

/**
 * Servlet implementation class AlumniServlet
 */
@WebServlet("/AlumniServlet")
public class AlumniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlumniServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getParameter("action");
		if(action.equals("addalumni")){
			String ID=request.getParameter("id");
			String name=request.getParameter("name");
			String program=request.getParameter("Program");
			String year=request.getParameter("yearofjoining");
			//HttpSession session = request.getSession(false);
			//String fid=(String)session.getAttribute("NETID");
			Alumni a = new Alumni();
			a.setId(ID);
			a.setName(name);
		    a.setProgram(program);
		    a.setYearofjoining(year); 
		    a.addalumni();
		    }
		if(action.equals("viewalumni")){
			Alumni c=new Alumni();
			ArrayList<String[]> a=c.viewalumni();
			//System.out.println(a);
			request.setAttribute("viewalumni",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewalumni.jsp");
					rd.forward(request, response);;
				
			}
		if(action.equals("updatealumni")){
			String ID=request.getParameter("id");
			String name=request.getParameter("name");
			String program=request.getParameter("Program");
			String year=request.getParameter("yearofjoining");
			//System.out.println(ID+"update");
			//System.out.println(name+"update");
		//	System.out.println(program+"update");
		//	System.out.println(year+"update");
			
			Alumni c=new Alumni();
			c.setId(ID);
			c.setName(name);
			c.setProgram(program);
			c.setYearofjoining(year);
			c.editalumni();
			//ArrayList<String[]> a=c.editalumni();
			
			
			RequestDispatcher rd = request.getRequestDispatcher("updatealumni.jsp");
			rd.forward(request, response);;
			
			
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
