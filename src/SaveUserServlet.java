import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Validator;

public class SaveUserServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("saveuser");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");

		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String hobby[] = request.getParameterValues("hobby");

		boolean isError = false;
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			error = error + "<br>Please Enter FirstName";
			isError = true;
		} else if (Validator.validAlpha(firstName) == false) {
			error = error + "<br>Please Enter Valid  FirstName";
			isError = true;

		}

		if (email == null || email.trim().length() == 0) {
			error = error + "<br>Please Enter Email";
			isError = true;
		} else if (email.endsWith("@gmail.com") == false || email.trim().length() <= 12) {
			error = error + "<br>Please Enter Valid Email";
			isError = true;
		}

		if (pwd == null || pwd.trim().length() == 0) {
			error = error + "<br>Please Enter Password";
			isError = true;
		}

		if (isError == true) {

			try {
				response.setContentType("text/html");// server send response as HTML
				PrintWriter out = response.getWriter(); // print writer --> server --> client --> response
				out.print("<html><body>");
				out.print(error);
				out.print("</body></html>");
			} catch (IOException e) {
				System.out.println("IO EXCEPTION");
			}

		} else {

			try {
				response.setContentType("text/html");// server send response as HTML
				PrintWriter out = response.getWriter(); // print writer --> server --> client --> response
				out.print("<html><body>");
				out.println("<br>FirstName : " + firstName);
				out.print("<br>Email : " + email);
				out.print("<br>password : " + pwd);
				out.print("<br>gender : " + gender);
				out.print("<br>country : " + country);
				out.print("<br>hobby : ");
				for (int i = 0; i < hobby.length; i++) {
						out.print(hobby[i]+"  ");
				}
				out.print("</body></html>");
			} catch (IOException e) {
				System.out.println("IO EXCEPTION");
			}
		}
	}

}
