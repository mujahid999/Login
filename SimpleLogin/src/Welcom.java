

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class Welcom
 */
@WebServlet("/Welcom")
public class Welcom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcom() {
        super();
                                                   
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String email=request.getParameter("email");
		 String pass =request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		if(email.equals("mujahid")&&pass.equals("jatoi")) {
			response.sendRedirect("WelcomePage.jsp");
		}else {
			response.sendRedirect("Error.jsp");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
