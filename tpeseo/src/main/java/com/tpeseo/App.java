package com.tpeseo;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	static String tableName = "";
	static String ville = ""; 

	public static final String ATT_MESSAGES = "messages";
    public static final String VUE          = "/WEB-INF/test_jdbc.jsp";
	
	
	private ArrayList<String> messages = new ArrayList<String>();

    public ArrayList<String> executerTests( HttpServletRequest request ) {

        return messages;
    }


    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        
        request.setAttribute( ATT_MESSAGES, messages );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //dropTable(tableName);
    	//readSV(filePath);
    }
}
