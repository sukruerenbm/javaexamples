

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.PrintWriter;
import javax.servlet.RequestDispatcher; 
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String un= request.getParameter("uname");
	      String pw= request.getParameter("pass");
	      
	      PrintWriter out=response.getWriter();
	      Cookie ck=new Cookie("auth", un);
	      ck.setMaxAge(600);
	       if(un.equals("java")&pw.equals("1234"))
	       {
	          response.addCookie(ck);
	          response.sendRedirect("home.jsp");
	          return;
	       }
	       else
	       {
	          RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	           out.println("<font color=red>Either user name or password is wrong.</font>");
	           rd.include(request, response);
	       }
	}

}
