package com.nelson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/suc")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    
	    PrintWriter out =    response.getWriter();
	    
	    out.print("<h1 aling='center'>");   
        out.print("×¢²á³É¹¦<a href = '/nelson/login.jsp'>ÇëµÇÂ½.</a>");
        out.print("</h1>"); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
