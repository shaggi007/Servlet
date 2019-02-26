package com.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_1
 */
@WebServlet("/Servlet_1")
public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   
			  
		        HttpSession session=request.getSession();
		          
		        String firstname=request.getParameter("firstname");  
		        PrintWriter out = response.getWriter();
		        out.print("FirstName: " +firstname); 
		        
		     
		        session.setAttribute("firstname",firstname);  
		          
		        out.println("<html>");
				out.println("<body>");
		        out.print("<form action='Servlet_2'>");  
		        out.print("LastName:<input type='text' name='lastname'>");  
		        out.print("<input type='submit' value='submit'>"); 
		        out.print("</form>");  
		        out.println("</body>");
		        out.println("</html>");
		                  
		       
		  
		                
		    }  
		  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
