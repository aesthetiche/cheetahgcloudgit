package com.cheetah.cvajay;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {
	private String message;
	public void init() throws ServletException{
		message = "Hello World!";
	}
	
	public void doGet(HttpServletRequest rq, HttpServletResponse res) throws ServletException,IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void destroy(){
		
	}
}
