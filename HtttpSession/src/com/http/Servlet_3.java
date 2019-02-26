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
 * Servlet implementation class Servlet_3
 */
@WebServlet("/Servlet_3")
public class Servlet_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			  
			HttpSession session = request.getSession(false);
	        PrintWriter out = response.getWriter();  
	        
	        String lastname=(String)session.getAttribute("lastname");  
	        String firstname=(String)session.getAttribute("firstname");  
	        String Qualification =request.getParameter("Qualification");
	        out.print("FirstName: " +firstname);
	        out.println("<br>lastName: "+lastname);
	        out.println("<br>Qualification: "+Qualification);
			session.setAttribute("Qualification", Qualification);
	       
			out.println("<html>");
			out.println("<body>");  
	        out.print("<form action='Servlet_4'>");  
	        out.print("Marks:<input type='text' name='Marks'>");  
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
