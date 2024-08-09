package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Student;
import com.dao.Studentdao;


@WebServlet("/signupcontroller")
public class signupcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public signupcontroller() {
        // TODO Auto-generated constructor stub
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		pw.print(name+" "+email+" "+user+" "+pwd);
		
		Student st=new Student(name, email, user, pwd);
		int status=Studentdao.insertdata(st);
		if(status>0)
		{
			pw.print("Your data succesfully inserted");
			
		}
		else
		{
			pw.print("Something wents to wrong please try again");
		}
		
	

}

}

