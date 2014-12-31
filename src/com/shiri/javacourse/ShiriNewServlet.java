package com.shiri.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShiriNewServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
	resp.setContentType("text/html");
	double radius = 50 ;
	double circleArea;
	circleArea = Math.PI*Math.pow(radius, 2);
	
	double hypotenuse = 50;
	double angleB = 30;
	double opposite = Math.sin(Math.toRadians(angleB))*hypotenuse;
	
	
	int base = 20;
	int exp = 13;
	double powCalculation = Math.pow(base, exp);
	
	
	
	String line1 = new String("calculation 1: Area of circle with radius" + radius + "is: "+ circleArea);
	String line2 = new String("calculation 2: Length of opposite where angle B is"+angleB +"is" + opposite);
	String line3 = new String("calculation 3: Power of" +base+ "with exp of" + exp + "is:"+ powCalculation);
	String resultStr = line1 + "<br>" + line2 + "<br>" +line3;
	
	resp.getWriter().println(resultStr);
}
}
