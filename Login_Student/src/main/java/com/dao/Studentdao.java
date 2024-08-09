package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bo.Addstudents;
import com.bo.Student;

public class Studentdao {

	public static Connection getConnection()
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Mahajan@240501");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static int insertdata(Student st)
	{
		int status=0;
		
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="insert into signupst(name,email,username,password)values(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setString(3, st.getUser());
			ps.setString(4, st.getPwd());
			
			
			status=ps.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	public static boolean login(String user,String pwd)
	{
		boolean status=false;
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="select*from signupst where username=? And Password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	public static int addstu(Addstudents st)
	{
		int status=0;
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="insert into addstu(name, email, phone, stream, clgname, dob, city, state, country, zip) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setString(3, st.getPhone());
			ps.setString(4, st.getStream());
			ps.setString(5, st.getClgname());
			ps.setString(6, st.getDob());
			ps.setString(7, st.getCity());
			ps.setString(8, st.getState());
			ps.setString(9, st.getCountry());
			ps.setInt(10, st.getZip());
			
			status=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	public static List getAllstudents()
	{
		List<Addstudents> list=new ArrayList<Addstudents>();
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="select*from addstu";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Addstudents st=new Addstudents();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));	
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
				st.setStream(rs.getString(5));
				st.setClgname(rs.getString(6));
				st.setDob(rs.getString(7));
				st.setCity(rs.getString(8));;
				st.setState(rs.getString(9));
				st.setCountry(rs.getString(10));
				st.setZip(rs.getInt(11));
				list.add(st);
				
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Addstudents StudentDetailsbyid(int id)
	{
		Addstudents ad=new Addstudents();
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="select*from addstu where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Addstudents st=new Addstudents();
				ad.setId(rs.getInt(1));
				ad.setName(rs.getString(2));	
				ad.setEmail(rs.getString(3));
				ad.setPhone(rs.getString(4));
				ad.setStream(rs.getString(5));
				ad.setClgname(rs.getString(6));
				ad.setDob(rs.getString(7));
				ad.setCity(rs.getString(8));;
				ad.setState(rs.getString(9));
				ad.setCountry(rs.getString(10));
				ad.setZip(rs.getInt(11));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ad;
	}
	public static int updatestudents(Addstudents st)
	{
		int status=0;
		try
		{
			Connection con=Studentdao.getConnection();
			String sql="update addstu set name=?,email=?,phone=?,stream=?,clgname=?,dob=?,city=?,state=?,country=?,zip=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setString(3, st.getPhone());
			ps.setString(4, st.getStream());
			ps.setString(5, st.getClgname());
			ps.setString(6, st.getDob());
			ps.setString(7, st.getCity());
			ps.setString(8, st.getState());
			ps.setString(9, st.getCountry());
			ps.setInt(10, st.getZip());
			ps.setInt(11, st.getId());
			
			status=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return status;
	}
	public static int deleteStudents(int id)
	{
		int status=0;
		try
		{
		
		Connection con=Studentdao.getConnection();
		String sql="delete from addstu where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		
		status=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
		
	}


}