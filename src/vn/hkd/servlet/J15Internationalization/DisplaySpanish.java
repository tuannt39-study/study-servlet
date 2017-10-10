package vn.hkd.servlet.J15Internationalization;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplaySpanish
 */
// 2 - 
@WebServlet("/DisplaySpanish")
public class DisplaySpanish extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplaySpanish() {
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
	    // Set spanish language code.
	    response.setHeader("Content-Language", "es");

	    String title = "En Espa&ntilde;ol";
	    String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";
	    out.println(docType +"<html>\n" +"<head><title>" + title + "</title></head>\n" +"<body bgcolor=\"#f0f0f0\">\n" +"<h1>" + "En Espa&ntilde;ol:" + "</h1>\n" +"<h1>" + "&iexcl;Hola Mundo!" + "</h1>\n" +"</body></html>");
	}

}
