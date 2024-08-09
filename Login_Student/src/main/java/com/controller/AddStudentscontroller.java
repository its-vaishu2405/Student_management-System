package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Addstudents;
import com.dao.Studentdao;

/**
 * Servlet implementation class AddStudentscontroller
 */
@WebServlet("/AddStudentscontroller")
public class AddStudentscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddStudentscontroller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String stream=request.getParameter("stream");
		String clgname=request.getParameter("clgname");
		String dob=request.getParameter("dob");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		int zip=Integer.parseInt(request.getParameter("zip"));
		Addstudents as=new Addstudents(name, email, phone, stream, clgname, dob, city, state, country, zip);
		
		int status=Studentdao.addstu(as);
		if(status>0)
		{
			pw.print("<script>alert('Student added successfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.html");
			rd.include(request, response);
			
		}
		else
		{
			pw.print("Something wents wrong!!!");
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.html");
			rd.include(request, response);
		}
		
		
	}
		

}
