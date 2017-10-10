package vn.hkd.servlet.J13HitCounter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageHitCounter
 */
//http://localhost:8080/ServletVJ/PageHitCounter
@WebServlet("/PageHitCounter")
public class PageHitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int hitCount;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageHitCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		hitCount = 0;
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
	      response.setContentType("text/html");
	      // This method executes whenever the servlet is hit 
	      // increment hitCount 
	      hitCount++;
	      PrintWriter out = response.getWriter();
	      String title = "Total Number of Hits";
	      String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";
	      out.println(docType +"<html>\n" +"<head><title>" + title + "</title></head>\n" +"<body bgcolor=\"#f0f0f0\">\n" +"<h1 align=\"center\">" + title + "</h1>\n" +"<h2 align=\"center\">" + hitCount + "</h2>\n" +"</body></html>");
	}

}
