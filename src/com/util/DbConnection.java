package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

	static String url = "jdbc:mysql://localhost:3306/advjava8";
	static String userName = "root";
	static String password = "root";
	static String driverClass = "com.mysql.cj.jdbc.Driver";

	public static void getConnection() {

		try {
			// driver load
			Class.forName(driverClass);

			Connection con = DriverManager.getConnection(url, userName, password);
			if (con != null) {
				System.out.println("DbConnected");
				PreparedStatement pstmt = con
						.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");

				pstmt.setString(1, "ram");
				pstmt.setString(2, "ram@gmail.com");
				pstmt.setString(3, "ram123");

				pstmt.executeUpdate();// run query

			} else {
				System.out.println("Db NOT connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}
