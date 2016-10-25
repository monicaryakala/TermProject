

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Courses;

/**
 * Servlet implementation class CoursesServlet
 */
@WebServlet("/CoursesServlet")
public class CoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoursesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		/*if(action.equals("viewcourses")){
			Courses c=new Courses();
			ArrayList<String[]>a=c.ArrayList<String[]>(); 
			                            }
			*/                            
		if(action.equals("addcourse")){
			String courseID=request.getParameter("courseID");
			String course=request.getParameter("Course");
			String details=request.getParameter("details");
			String concentration=request.getParameter("concentration");
			String requirements=request.getParameter("requirements");
			HttpSession session = request.getSession(false);
			String fid=(String)session.getAttribute("NETID");
			Courses c = new Courses();
			c.setID(courseID);
			c.setname(course);
			c.setDetails(details);
			c.setFacultyID(fid);
			c.setConcentration(concentration);
			c.setRequirements(requirements);
			c.addcourses();
		                               }
		if(action.equals("viewallcourses")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewallcourses();
			//System.out.println(a);
			request.setAttribute("course",a);
			RequestDispatcher rd = request.getRequestDispatcher("Viewcourses.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewofficehrs")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewallcourses();
			//System.out.println(a);
			request.setAttribute("officehrs",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewofficehrs.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewcomputerscience")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewcomputerscience();
			System.out.println(a);
			request.setAttribute("computerscience",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewcomputerscience.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewcomputerengineering")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewcomputerengineering();
			System.out.println(a);
			request.setAttribute("computerengineering",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewcomputerengineering.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewinformationscience")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewinformationscience();
			System.out.println(a);
			request.setAttribute("informationscience",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewinformationscience.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewcurrentsemester")){
			
		
			Courses c=new Courses();
			ArrayList<String[]> a=c.
					viewacurrentsemester();
			
			System.out.println(a);
			System.out.println(a);
			request.setAttribute("currentsemester",a);
			RequestDispatcher rd = request.getRequestDispatcher("Studentcurrentsemester.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("studentviewallcourses")){
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewallcourses();
			//System.out.println(a);
			request.setAttribute("course",a);
			RequestDispatcher rd = request.getRequestDispatcher("studentviewallcourses.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewmycourses")){
			HttpSession session = request.getSession(false);
			String fid=(String)session.getAttribute("NETID");
			String id=request.getParameter("NETID");
			Courses c=new Courses();
			ArrayList<String[]> a=c.viewmycourses(fid);
			/*request.setAttribute("mycourses", a);*/
			
			//Courses c1 = new Courses();
			//c.setFid1(fid1);
			request.setAttribute("mycourses", a);
			RequestDispatcher rd=request.getRequestDispatcher("myCourses.jsp");
			rd.forward(request,response);
			
		}
if(action.equals("officehrs")){
			
			String monica=request.getParameter("monica");
			//System.out.println(monica);
			//System.out.println(monica);
		//	System.out.println(monica);
			String hrs=request.getParameter("Officehours");
			String ta=request.getParameter("TAinfo");
			String syllabus=request.getParameter("syllabus");
			Courses c= new Courses();
			c.setPostofficehrs(hrs);
			c.setTa(ta);
			c.setSyllabus(syllabus);
			c.setID(monica);
			c.postofficehrs();
			
			
		}
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		 doGet(request, response);
	}

}
