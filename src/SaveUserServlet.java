import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveUserServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("saveuser");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(pwd);

		try {
			response.setContentType("text/html");// server send response as HTML
			PrintWriter out = response.getWriter(); // print writer --> server --> client --> response
			out.print("<html><body>");
			out.println("<br>FirstName : " + firstName);
			out.print("<br>Email : " + email);
			out.print("<br>password : " + pwd);
			out.print("</body></html>");
		} catch (IOException e) {
			System.out.println("IO EXCEPTION");
		}

	}

}
