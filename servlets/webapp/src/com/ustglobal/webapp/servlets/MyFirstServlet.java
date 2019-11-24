package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		String companyName=context.getInitParameter("company-name");
		
		ServletConfig config=getServletConfig();
		String batchName=config.getInitParameter("batch-name");
		
		PrintWriter out=resp.getWriter();//only response can connect with browser........if i create a object using "new" keyword then we can't interact with the browser
		resp.setContentType("text/html");//specifying the type of content and by default it has text/html
		out.println("<html>");
		out.println("<body>");
		
		Date date=new Date();
		out.println("<h1 style='color:red'>Date and Time is:");
		out.println(date.toString());
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		String url=req.getRequestURI();
		String method=req.getMethod();
		out.println("<br>");
		out.println(url);
		out.println("<br>");
		out.println(method);
		
		out.println("</body>");
		out.println("</html>");
		
		
	}//end of doGet
	
}//end of MyFirstServlet
