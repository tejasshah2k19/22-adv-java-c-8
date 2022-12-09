package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DbAddUserServlet extends HttpServlet {
	static String url = "jdbc:mysql://localhost:3306/advjava8";
	static String userName = "root";
	static String dbPassword = "root";
	static String driverClass = "com.mysql.cj.jdbc.Driver";

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			// driver load
			Class.forName(driverClass);

			Connection con = DriverManager.getConnection(url, userName, dbPassword);
			if (con != null) {
				System.out.println("DbConnected");
				PreparedStatement pstmt = con
						.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");

				pstmt.setString(1, firstName);
				pstmt.setString(2, email);
				pstmt.setString(3, password);

				pstmt.executeUpdate();// run query
				System.out.println("user inserted....");
			} else {
				System.out.println("Db NOT connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		response.sendRedirect("DbAddUser.jsp");
	}

}
