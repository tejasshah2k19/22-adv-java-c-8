package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintRequestHeaderServlet")
public class PrintRequestHeaderServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Enumeration<String> headers = request.getHeaderNames();
		request.setAttribute("headers", headers);

		RequestDispatcher rd = request.getRequestDispatcher("PrintRequestHeaders.jsp");
		rd.forward(request, response);
	}
}
