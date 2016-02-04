package com.cheetah.cvajay;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import java.io.*;
import javax.servlet.*;
public class AjaxServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		PrintWriter out = res.getWriter();
		double x = Math.random();
		out.println("Hello Ajax" + x);
		
	}

	
}
