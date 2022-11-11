package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignupFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("SignupFilter");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {

			// goback
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);
		} else {
			// goahed -> go to servlet
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}

//1 -> implements Filter
//2 -> init doFilter[logic] destroy 
//3 -> web.xml 