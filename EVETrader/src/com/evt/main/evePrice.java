package com.evt.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accueil
 */
public class evePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public evePrice() {
 
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String as=  new String(request.getParameter("items").getBytes(),"UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<head>");
		out.print("<link rel=\"stylesheet\" href=\"css/evetrade.css\" type=\"text/css\" />");
		out.print("<title>Price estimate</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Estimated Price</h1>");

		evaluate myobj=new evaluate(out);
		float result;

		try
		{
			String[] lig=as.split("\n");
			List<String> itemSearch = new ArrayList();
			List<String> QuantitySearch = new ArrayList();

			for (int i=0;i<lig.length;i++)
			{
				//lig[i].replaceAll("?","");
				String[] col=lig[i].split("\t");
				if (col.length>1)
				{
					String num="";
					for (int j=0;j<col[1].length();j++)
					{
						if (col[1].charAt(j)>='0' && col[1].charAt(j)<='9')
						{
							num=num+col[1].charAt(j);
						}
					}
					itemSearch.add(col[0]);
					QuantitySearch.add(num);
				}
			}
			result = myobj.getItemPrice(itemSearch,QuantitySearch);
			
		}
		catch (Exception e)
		{
			result=-1;
			e.printStackTrace();
		}
		out.print("The result is : <b>"+String.format("%.2f", result)+"</b>");
		out.print("</body>");
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
