package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class LoginPage extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int flag=0;
	response.setContentType("text/html");
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	//response.getWriter().println(userName);
	
		//response.getWriter().println(ck);
		if(userName.equals("Divya")&& password.contentEquals("abcd*")) {
			response.getWriter().println("Success");
			request.getRequestDispatcher("/index.html").include(request,response);
			}
		else{
			response.getWriter().println("Failure");
			request.getRequestDispatcher("/index.html").include(request,response);
			
		}
	}
	
	

}
