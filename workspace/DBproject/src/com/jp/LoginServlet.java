package com.jp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("txtName");
	System.out.println(username);
	
	String password = request.getParameter("txtPassword");
	System.out.println(password);
	
	PrintWriter out = response.getWriter();
	
	dbDAO db = new dbDAO();
	response.setContentType("text/html");
	
	if(db.validateUser(username, password)){
		//out.write("<h1> Valid User </h1>");
		response.sendRedirect("dbServlet");
	}else{
		out.write("<h1> InValid User </h1>");
	
		}
	
	
	
}
	

}
