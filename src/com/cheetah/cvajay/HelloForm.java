package com.cheetah.cvajay;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloForm extends HttpServlet{ 
	
	public void init() throws ServletException {
		
		
	}
	
	public void doGet(HttpServletRequest rqs, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		String title = "Servelt form response";
		String doctype = "<!DOCTYPE>";
		PrintWriter out = res.getWriter();
		out.println(rqs.getParameter("firstn") + rqs.getParameter("lastn"));
	}

}
