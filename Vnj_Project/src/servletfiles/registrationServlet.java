package servletfiles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import databaseHelper.DatabaseConfig;

/**
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		insertData(request,response,fullname,user,pass);
		
	}

	public static void insertData(HttpServletRequest request,HttpServletResponse response,String fullname,String user,String pass) {
		Connection con = DatabaseConfig.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into userInfo values (default,?,?,?);");
			ps.setString(1,fullname);
			ps.setString(2, user);
			ps.setString(3, pass);
			int i = ps.executeUpdate();
			
			if(i>0) {
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}else {
				PrintWriter out = response.getWriter();
				out.print("Registration unsuccessful");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
