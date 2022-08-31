import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// logic

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));

		int addition = n1 + n2;

		response.setContentType("text/html");// MIME

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print(n1 + " + " + n2 + " = " + addition);
		out.print("</body></html>");
	}
}
