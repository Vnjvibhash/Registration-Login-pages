package servletfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReadDao;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String url = request.getParameter("url");
		 if(ReadDao.read(url)) {
			 out.println("<html>");
			 out.println("<body>");
			 out.println("<h1> Its phishing website</h1>");
			 out.println("</body>");
			 out.println("</html>");
			
		  }else {
			  out.println("<html>");
				 out.println("<body>");
				 out.println("<h1> Its safe website</h1>");
				 out.println("</body>");
				 out.println("</html>");
			   
		  }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
