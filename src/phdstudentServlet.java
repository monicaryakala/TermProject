

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.phdstudent;

/**
 * Servlet implementation class phdstudentServlet
 */
@WebServlet("/phdstudentServlet")
public class phdstudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public phdstudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String action=request.getParameter("action");
		
			
	    if(action!=null){
	    	
	    	
	    	String id=request.getParameter("id");
	    	phdstudent phd=new phdstudent();
	    	ArrayList<String[]> a1=phd.phdinfo(id);
	    	request.setAttribute("phdinfo", a1);
	    	RequestDispatcher rd1=request.getRequestDispatcher("viewphdinfo.jsp");
	    	rd1.forward(request, response);
	    }
	    	else
	    	{
	    		String action1=request.getParameter("action");
			    //if(action.equals("viewallcourses")){
	            //System.out.println(action);
				phdstudent p1=new phdstudent();
				ArrayList<String[]> a11=p1.viewphdstudent();
				//System.out.println(a);
				request.setAttribute("phdstudent",a11);
				RequestDispatcher rd11 = request.getRequestDispatcher("Phdstudent.jsp");
						rd11.forward(request, response);;
	    	
	    }
	}

	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
