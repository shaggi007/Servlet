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
 * Servlet implementation class Servlet_4
 */
@WebServlet("/Servlet_4")
public class Servlet_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			HttpSession session=request.getSession(false);
	        PrintWriter out = response.getWriter(); 
		
	        String lastname = (String)session.getAttribute("lastname");
			String firstname =(String)session.getAttribute("firstname");
			String Qualification = (String) session.getAttribute("Qualification");
			String Marks = request.getParameter("Marks");
			out.println("FirstName: "+firstname);
			out.println("<br>LastName: "+lastname);
			out.println("<br>Qualification: "+Qualification);
			out.println("<br>Marks: "+Marks);
	       
}

		
	        
	          
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
