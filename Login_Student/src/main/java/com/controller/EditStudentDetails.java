package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.Addstudents;
import com.dao.Studentdao;

/**
 * Servlet implementation class EditStudentDetails
 */
@WebServlet("/EditStudentDetails")
public class EditStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		Addstudents eb=Studentdao.StudentDetailsbyid(id);
		
		//pw.print(st.getId()+st.getName());
		
		
		
		pw.print("<form  action='UpdateDeatils' method='post'> ");
	    
		pw.print("<table>");
	//'hidden' disabled
		pw.print("<tr><td> Id: </td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>Name: </td> <td><input type='text' name='name' value='"+eb.getName()+"'/></td></tr>");
	   	pw.print("<tr><td>Email: </td> <td><input type='text' name='email' value='"+eb.getEmail()+"'/></td></tr>");
	   	pw.print("<tr><td>Phone:</td> <td><input type='text' name='phone' value='"+eb.getPhone()+"'/></td></tr>");
	   	pw.print("<tr><td>Stream : </td> <td><input type='text' name='stream' value='"+eb.getStream()+"'/></td></tr>");
	   	pw.print("<tr><td>College Name: </td> <td><input type='text' name='clgname' value='"+eb.getClgname()+"'/></td></tr>");
	   	pw.print("<tr><td>DOB : </td> <td><input type='text' name='dob' value='"+eb.getDob()+"'/></td></tr>");
		pw.print("<tr><td>City:</td> <td><input type='text' name='city' value='"+eb.getCity()+"'/></td></tr>");
	   	pw.print("<tr><td>State : </td> <td><input type='text' name='state' value='"+eb.getState()+"'/></td></tr>");
	   	pw.print("<tr><td>Country: </td> <td><input type='text' name='country' value='"+eb.getCountry()+"'/></td></tr>");
	   	pw.print("<tr><td>Zip: </td> <td><input type='text' name='zip' value='"+eb.getZip()+"'/></td></tr>");
		
	    pw.print("<tr><td><input type='submit' value='Update'/></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
		
	}


}
