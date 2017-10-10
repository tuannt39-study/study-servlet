package vn.hkd.servlet.J11Date;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentSimpleDateFormat
 */
//http://localhost:8080/ServletVJ/CurrentSimpleDateFormat
@WebServlet("/CurrentSimpleDateFormat")
public class CurrentSimpleDateFormat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrentSimpleDateFormat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "Display Current Date & Time";
	      Date dNow = new Date( );
	      SimpleDateFormat ft =  new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";
	      out.println(docType +"<html>\n" +"<head><title>" + title + "</title></head>\n" +"<body bgcolor=\"#f0f0f0\">\n" +"<h1 align=\"center\">" + title + "</h1>\n" +"<h2 align=\"center\">" + ft.format(dNow) + "</h2>\n" +"</body></html>");
	}

}
