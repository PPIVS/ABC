import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OpenHomePageServlet extends HttpServlet
{

         public void doPost(HttpServletRequest request, HttpServletResponse response)
		 
		   throws ServletException, IOException
		   
		   {	 
		 response.sendRedirect("/Fyp/HTML FILES/HomePage.html");
		 
		   }



}