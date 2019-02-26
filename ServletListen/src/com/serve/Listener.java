package com.serve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class Listener implements ServletContextListener {
	Connection con=null;
    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
         // TODO Auto-generated method stub
    

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("first line");
		ServletContext context = arg0.getServletContext();
		String driver = context.getInitParameter("Driver");
		String url = context.getInitParameter("URL");
		String user = context.getInitParameter("User");
		String password = context.getInitParameter("Password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		try {
			Class.forName(driver);
			System.out.println("driver loaded successfully");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection successful");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		context.setAttribute("ConnectionObject", con);
    }
	
}
