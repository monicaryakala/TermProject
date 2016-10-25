

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Announcement;
import model.Courses;

/**
 * Servlet implementation class AnnouncementServlet
 */
@WebServlet("/AnnouncementServlet")
public class AnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnouncementServlet() {
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
		if(action.equals("addjobannouncement")){
			String jobtitle=request.getParameter("Jobtitle");
			
			String jobdetails=request.getParameter("jdetails");

			HttpSession session = request.getSession(false);
			String fid=(String)session.getAttribute("NETID");
			Announcement a1 = new Announcement();
			a1.setJobtitle(jobtitle);
			
	        a1.setJdetails(jobdetails);
	     
	        a1.addjobannouncement();
		                               }
		if(action.equals("applyjobs")){
			String jobtitle=request.getParameter("jobtitle");
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");

		//	HttpSession session = request.getSession(false);
			//String fid=(String)session.getAttribute("NETID");
			Announcement a1 = new Announcement();
			a1.setJobtitle(jobtitle);
			
	        a1.setName(name);
	        a1.setEmail(email);
	     
	        a1.applyjobs();
	        RequestDispatcher rd = request.getRequestDispatcher("applyjobs.jsp");
 			rd.forward(request, response);;
		                               }
		if(action.equals("addeventannouncement")){
			String eventtitle=request.getParameter("Eventtitle");
			String eventdetails=request.getParameter("edetails");
			HttpSession session = request.getSession(false);
			String fid=(String)session.getAttribute("NETID");
			Announcement a1 = new Announcement();
			a1.setEventtitle(eventtitle);
			a1.setEdetails(eventdetails);
			 a1.addeventannouncement();
			
			
		}
		if(action.equals("addnewsannouncement")){
			String newstitle=request.getParameter("Newstitle");
			String newsdetails=request.getParameter("ndetails");
			HttpSession session = request.getSession(false);
			String fid=(String)session.getAttribute("NETID");
			Announcement a1 = new Announcement();

			a1.setNewstitle(newstitle);
		 a1.setNdetails(newsdetails);
			a1.addnewsannouncement();
			
		}
		if(action.equals("viewjobannouncement")){
			Announcement a1 = new Announcement();
			ArrayList<String[]> a=a1.viewjobannouncementonly();
			//System.out.println(a);
			request.setAttribute("viewjob",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewjobs.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewjobannouncementonly")){
			Announcement a1 = new Announcement();
			ArrayList<String[]> a=a1.viewjobannouncement();
			//System.out.println(a);
			request.setAttribute("viewjobonly",a);
			RequestDispatcher rd = request.getRequestDispatcher("studentviewjobs.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("vieweventannouncement")){
			Announcement a1 = new Announcement();
			ArrayList<String[]> a=a1.viewEventannouncement();
			//System.out.println(a);
			request.setAttribute("viewevent",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewevents.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("viewnewsannouncement")){
			Announcement a1 = new Announcement();
			ArrayList<String[]> a=a1.viewnewsannouncement();
			//System.out.println(a);
			request.setAttribute("viewnews",a);
			RequestDispatcher rd = request.getRequestDispatcher("viewnews.jsp");
					rd.forward(request, response);;
			
		}
		if(action.equals("updatejobs")){
			
			String jobtitle=request.getParameter("jobtitle");
			String jobdetails=request.getParameter("jdetails");
			Announcement a1=new Announcement();
			a1.setJobtitle(jobtitle);
			a1.setJdetails(jobdetails);
             a1.editjobs();
             RequestDispatcher rd = request.getRequestDispatcher("updatejobs.jsp");
 			rd.forward(request, response);;
	}
if(action.equals("updateevents")){
			
			String eventtitle=request.getParameter("eventtitle");
			String edetails=request.getParameter("edetails");
			Announcement a1=new Announcement();
			a1.setEventtitle(eventtitle);
			a1.setEdetails(edetails);
             a1.editevents();
             RequestDispatcher rd = request.getRequestDispatcher("updateevents.jsp");
 			rd.forward(request, response);;
	}
if(action.equals("updatenews")){
	
	String newstitle=request.getParameter("newstitle");
	String ndetails=request.getParameter("ndetails");
	Announcement a1=new Announcement();
	a1.setNewstitle(newstitle);
	a1.setNdetails(ndetails);
     a1.editnews();
     RequestDispatcher rd = request.getRequestDispatcher("updatenews.jsp");
		rd.forward(request, response);;
}
if(action.equals("deletenews")){
	String newstitle=request.getParameter("newstitle");
	String ndetails=request.getParameter("ndetails");
	Announcement a1=new Announcement();
	a1.setNewstitle(newstitle);
	a1.setNdetails(ndetails);
     a1.deletenewsannouncement();
     RequestDispatcher rd = request.getRequestDispatcher("updatenews.jsp");
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
