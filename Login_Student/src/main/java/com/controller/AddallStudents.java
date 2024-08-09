package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Addstudents;
import com.dao.Studentdao;

/**
 * Servlet implementation class AddallStudents
 */
@WebServlet("/AddallStudents")
public class AddallStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddallStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<link rel='stylesheet' type='text/css' href='./css/Style.css'>");
		List<Addstudents> list=Studentdao.getAllstudents();
		pw.print("<h1>All student Information</h1>");
		
		pw.print("<a href='dashboard.html'>Back</a>");
		
		pw.print("<table border='1px' width='100%'> ");
	    
	    pw.print("<tr><th>Id</th> <th>Name</th> <th>Email</th> <th>Phone</th> <th>Stream</th> <th>College name</th> <th>DOB</th> <th>City</th> <th>State</th><th>Country</th><th>Zip-Code</th> <th colspan='2'> Actions</th></tr>");
	   
	   
		for(Addstudents eb:list) {
			  
			pw.print("<tr><td>"+eb.getId()+"</td><td>"+eb.getName()+"</td><td>"+eb.getEmail()+"</td><td>"+eb.getPhone()+"</td><td>"+eb.getStream()+"</td><td>"+eb.getClgname()+"</td><td>"+eb.getDob()+"</td><td>"+eb.getCity()+"</td><td>"+eb.getState()+"</td><td>"+eb.getCountry()+"</td><td>"+eb.getZip()+"</td><td>"+"<a href='EditStudentDetails?id="+eb.getId()+"'> edit </a> </td> <td><a href='DeleteStudentInfo?id="+eb.getId()+"'>delete </a></td></tr>"); 

		}
		
		pw.print("</table>");
	
	}

}
