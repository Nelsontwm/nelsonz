package com.nelson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fail")
public class Fail extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    
	    PrintWriter out =    response.getWriter();
	    
	    out.print("<h1 aling='center'>");   
        out.print("用户名或密码不存在<a href = '/nelson/register.jsp'>请注册</a>");
        out.print("</h1>"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
