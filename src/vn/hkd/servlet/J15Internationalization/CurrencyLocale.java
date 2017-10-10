package vn.hkd.servlet.J15Internationalization;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrencyLocale
 */
// 4 - 
@WebServlet("/CurrencyLocale")
public class CurrencyLocale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrencyLocale() {
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
	    //Get the client's Locale
	    Locale locale = request.getLocale( );
	    NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
	    String formattedCurr = nft.format(1000000);

	    String title = "Locale Specific Currency";
	    String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";
	    out.println(docType +"<html>\n" +"<head><title>" + title + "</title></head>\n" +"<body bgcolor=\"#f0f0f0\">\n" +"<h1 align=\"center\">" + formattedCurr + "</h1>\n" +"</body></html>");
	    
	}

}
