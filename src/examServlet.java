

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
import model.exam;
import model.phdstudent;

/**
 * Servlet implementation class examServlet
 */
@WebServlet("/examServlet")
public class examServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public examServlet() {
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
		if(action.equals("addexam")){
			String name=request.getParameter("examname");
			String date=request.getParameter("date");
			String details=request.getParameter("details");
			String result=request.getParameter("result");
			//HttpSession session = request.getSession(false);
			//String fid=(String)session.getAttribute("NETID");
			exam e = new exam();
			e.setName(name);
			e.setDate(date);
			e.setDetails(details);
			e.setResult(result);
			
			e.addexam();
			//System.out.println(name);
//System.out.println(date);
//System.out.println(details);
}
		if(action.equals("signup")){
			String name=request.getParameter("name");
		
			//HttpSession session = request.getSession(false);
			//String fid=(String)session.getAttribute("NETID");
			exam e = new exam();
			e.setName(name);
			
			e.signup();
		}
		if(action.equals("viewexam")){
			exam e=new exam();
			ArrayList<String[]> a=e.viewexam();
			//System.out.println(a);
			request.setAttribute("viewexam",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewexam.jsp");
					rd.forward(request, response);;
		}
		if(action.equals("viewexamonly")){
			exam e=new exam();
			ArrayList<String[]> a=e.viewexam();
			//System.out.println(a);
			request.setAttribute("viewexam",a);
			RequestDispatcher rd = request.getRequestDispatcher("examsignup.jsp");
					rd.forward(request, response);;
		}
	if(action.equals("viewresult")){
		//String id=request.getParameter("id");
		exam e=new exam();
    	ArrayList<String[]> a1=e.viewresult();
    	request.setAttribute("viewresult", a1);
    	RequestDispatcher rd1=request.getRequestDispatcher("viewresult.jsp");
    	rd1.forward(request, response);

		
	}
	if(action.equals("updateresult")){
		
		String name=request.getParameter("name");
		String date=request.getParameter("details");
		String details=request.getParameter("date");
		String result=request.getParameter("result");
		//System.out.println(ID+"update");
		//System.out.println(name+"update");
		//System.out.println(program+"update");
		//System.out.println(year+"update");
		
		exam e=new exam();
		e.setName(name);
		e.setDetails(details);
		e.setDate(date);
		
		e.setResult(result);
		e.editresult();
		//ArrayList<String[]> a=c.editalumni();
		
		
		RequestDispatcher rd = request.getRequestDispatcher("viewexamresults.jsp");
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
