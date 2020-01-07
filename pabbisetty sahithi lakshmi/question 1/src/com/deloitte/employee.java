package com.deloitte;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet(urlPatterns = { "/login" })
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		

	}

	public void destroy() {
		System.out.println("destroy called");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		System.out.println("do get called");
	String name=request.getParameter("name");
	String desig=request.getParameter("desig");
	request.setAttribute("name", name);
	request.setAttribute("desig", desig);
	String displayPage="display.jsp";
	request.getRequestDispatcher("admin").forward(request, response);
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post called");
		doGet(request, response);
	}

}