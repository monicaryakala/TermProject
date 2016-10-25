

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DiscussionBoard;

/**
 * Servlet implementation class DiscussionboardServlet
 */
@WebServlet("/DiscussionboardServlet")
public class DiscussionboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiscussionboardServlet() {
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
		String button = request.getParameter("button");
		DiscussionBoard d=new DiscussionBoard();
		if(button.equals("post")){
		String ct=request.getParameter("text");
		String t=request.getParameter("title");
		
		d.setHashtagfeed1(t);
		d.setContent(ct);
		d.setParentFeed(0); //initialized to 0 because we are taking it for post
	    d.hashfeed1();
	    
	    d.setHashtagfeed1(t);
		Map map= d.setHashfeed1();    //store return value from hashtagfeed 
		request.setAttribute("map", map);
		
		request.setAttribute("title", t);
		RequestDispatcher rd=request.getRequestDispatcher("viewhashtagdb.jsp");
	    rd.forward(request, response);
	    
		}else{
			String content = request.getParameter("reply");
			String hashtag = request.getParameter("title");
			int id = Integer.parseInt(request.getParameter("id"));
			d.setHashtagfeed1(hashtag);
			d.setContent(content);
			d.setParentFeed(id); 
		    d.hashfeed1();
		    
		    
		   
			d.setHashtagfeed1(hashtag);
			Map map= d.setHashfeed1();    //store return value from hashtagfeed 
			request.setAttribute("map", map);
			
			request.setAttribute("title", hashtag);
			RequestDispatcher rd=request.getRequestDispatcher("viewhashtagdb.jsp");
		    rd.forward(request, response);
		    
		//doGet(request, response);
	}

}
}
