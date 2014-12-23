package com.shiri.javacourse;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Shiri_JavaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		//variable declaration
		int num1;
		int num2;
		int num3;
		//variable assignment
		num1 = 4;
		num2 = 3;
		num3 = 7;
		//add calculations here
		int result = (num1 + num2) * num3;
		//define a string to include all calculations:
		String resultStr = new String("<h1>Result of ("+num1+"+"+num2+")*"+num3+"="+result+"</h1>");
		resp.getWriter().println(resultStr);
		
	}
}
