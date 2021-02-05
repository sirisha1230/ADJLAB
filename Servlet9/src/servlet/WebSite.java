package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebSite
 */
@WebServlet("/WebSite")
public class WebSite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebSite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String value = request.getParameter("websites");
		
		if(value.equals("svecw")) {
			response.sendRedirect("https://www.svecw.edu.in");
		}
		else if(value.equals("youtube")) {
			response.sendRedirect("https://www.youtube.com");
		}
		else if(value.equals("gmail")) {
			response.sendRedirect("https://www.gmail.com");
		}
		else if(value.equals("google")) {
			response.sendRedirect("https://www.google.com");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
