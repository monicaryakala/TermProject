 

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.phdstudent;
import model.resources;

/**
 * Servlet implementation class resourcesServlet
 */
@WebServlet("/resourcesServlet")
public class resourcesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resourcesServlet() {
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
		if(action.equals("addresources")){
			String id=request.getParameter("id");
			String name=request.getParameter("Nameofresource");
			String type=request.getParameter("type");
			String details=request.getParameter("details");
			resources r=new resources();
			r.setID(id);
			r.setName(name);
			r.setType(type);
			r.setDetails(details);
			r.addresource();
			//System.out.println(name);
			//System.out.println(type);
			//System.out.println(details);
		}
		if(action.equals("viewresources")){
			resources r=new resources();
			ArrayList<String[]> a=r.viewresources();
			//System.out.println(a);
			request.setAttribute("viewresources",a);
			RequestDispatcher rd = request.getRequestDispatcher("Reserveresource.jsp");
					rd.forward(request, response);;
		}
		if(action.equals("reserveresource")){

	    	String id=request.getParameter("id");
	    	resources r=new resources();
	    	ArrayList<String[]> a1=r.reserveresource(id);
	    	request.setAttribute("reserve", a1);
	    	RequestDispatcher rd1=request.getRequestDispatcher("reserveresource2.jsp");
	    	rd1.forward(request, response);
			
		}
		if(action.equals("bookslot")){
			resources r=new resources();
			String id=request.getParameter("id");
			String date=request.getParameter("date");
			//String slot=request.getParameter("slot1");
			ArrayList<String> a=r.bookslot(id,date);
			request.setAttribute("bookslot", a);
			RequestDispatcher rd1=request.getRequestDispatcher("");
			rd1.forward(request, response);
			
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
