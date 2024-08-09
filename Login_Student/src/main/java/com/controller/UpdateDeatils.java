
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Addstudents;
import com.bo.Student;
import com.dao.Studentdao;


@WebServlet("/UpdateDeatils")
public class UpdateDeatils extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDeatils() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		try
		{
			int id=Integer.parseInt(request.getParameter("id"));
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
			
			Addstudents st=new Addstudents(id, name, email, phone, stream, clgname, dob, city, state, country, zip);
			int status=Studentdao.updatestudents(st);
			if(status>0)
			{
				pw.print("<script>alert('Your data has been successfully updated')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("AddallStudents");
				rd.include(request, response);
				
			}
			else
			{
				pw.print("<script>alert('Something went wrong please try again')</script>");
				RequestDispatcher rd=request.getRequestDispatcher("AddallStudents");
				rd.include(request, response);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}