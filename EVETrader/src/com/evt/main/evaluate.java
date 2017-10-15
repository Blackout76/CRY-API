package com.evt.main;

import java.beans.Statement;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.naming.*;
import javax.sql.*;
import java.sql.*;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.api.DogmaApi;
import net.troja.eve.esi.api.MarketApi;
import net.troja.eve.esi.api.SearchApi;
import net.troja.eve.esi.api.UniverseApi;
import net.troja.eve.esi.auth.OAuth;
import net.troja.eve.esi.auth.SsoScopes;
import net.troja.eve.esi.model.CategoryResponse;
import net.troja.eve.esi.model.DogmaAttributeResponse;
import net.troja.eve.esi.model.DogmaEffectResponse;
import net.troja.eve.esi.model.GroupResponse;
import net.troja.eve.esi.model.MarketOrdersResponse;
import net.troja.eve.esi.model.TypeDogmaAttribute;
import net.troja.eve.esi.model.TypeDogmaEffect;
import net.troja.eve.esi.model.TypeResponse;

public class evaluate extends Thread {

	static String clientID="ca3afa15ceae4831864ee5d62df9bf8a";
	static String clientSecret="GxVhe2oHMQe7EPD4x6dnok9bCOayPDfjtVotkC07";

	static String JITA="Jita IV - Moon 4 - Caldari Navy Assembly Plant";
	static String FORGE="The Forge";

	static String code;
	static boolean ok=false;
	PrintWriter out;

		public evaluate(PrintWriter iout) {
			out=iout;
		}

		public float getItemPrice(List<String> itemSearch,List<String> quantitySearch) throws Exception
		{
			final String state = "somesecret";
			float price=0;
			
			Options options = new Options();
			
			Connection conn= getConnection();

			final ApiClient client = new ApiClient();
			client.setConnectTimeout(100000);
			final OAuth auth = (OAuth) client.getAuthentication("evesso");
			auth.setClientId(clientID);
			auth.setClientSecret(clientSecret);
			Configuration conf=new Configuration();
			conf.setDefaultApiClient(client);

			final Set<String> scopes = new HashSet<>(Arrays.asList(SsoScopes.ESI_MARKETS_STRUCTURE_MARKETS_V1));

			out.print("<table>");
			out.print("<th>");
			out.print("<td>");
			out.print("typeID");
			out.print("</td>");
			out.print("<td>");
			out.print("GR/CAT Id");
			out.print("</td>");
			out.print("<td>");
			out.print("groupName");
			out.print("</td>");
			out.print("<td>");
			out.print("materialTypeId");
			out.print("</td>");
			out.print("<td>");
			out.print("Quantity for 100");
			out.print("</td>");
			out.print("<td>");
			out.print("price for 1");
			out.print("</td>");
			out.print("<td>");
			out.print("quantity");
			out.print("</td>");
			out.print("<td>");
			out.print("price");
			out.print("</td>");
			out.print("<td>");
			out.print("taxe applied");
			out.print("</td>");
			out.print("</th>");

			for (int i=0;i<itemSearch.size();i++)
			{
				long idItem=SearchItem(itemSearch.get(i));
				long idRegion=SearchRegion(FORGE);
				long idStation=SearchStation(JITA);
				if (isAsteroid(conn,idItem))
				{
					price=price+getPriceAsteroid(conn,idRegion,idStation,idItem,itemSearch.get(i),Integer.parseInt(quantitySearch.get(i)));
				}
				else
				{
					price=price+getPrice(conn,idRegion,idStation,idItem,itemSearch.get(i),Integer.parseInt(quantitySearch.get(i)));
				}
			
			}
			
			out.print("<table>");
			
			conn.close();
			return(price);
		}

    	public float getSellMin(long idRegion, long idStation,long idItem) throws Exception
    	{

    		final MarketApi apim = new MarketApi();
    	
    		final List<MarketOrdersResponse> priceSell = apim.getMarketsRegionIdOrders("sell",(int) idRegion,"tranquility",Integer.MAX_VALUE, (int) idItem, "", "");

    		order orderSellMin=null;

    		for (int i=0;i<priceSell.size();i++)
    		{
    			if (priceSell.get(i).getLocationId()==idStation)
    			{
    				if (orderSellMin==null)
    				{
    					orderSellMin = new order(priceSell.get(i).getOrderId(), priceSell.get(i).getTypeId(),priceSell.get(i).getLocationId(),priceSell.get(i).getVolumeTotal(),priceSell.get(i).getPrice());
    				}
    				else
    				{
    					if (orderSellMin.getPrice()>priceSell.get(i).getPrice())
    					{
    						orderSellMin = new order(priceSell.get(i).getOrderId(), priceSell.get(i).getTypeId(),priceSell.get(i).getLocationId(),priceSell.get(i).getVolumeTotal(),priceSell.get(i).getPrice());
    					}
    				}
    			}
    		}
    		return(orderSellMin.getPrice());
    	}

       	public float getBuyMax(long idRegion, long idStation,long idItem) throws Exception
    	{
    		final MarketApi apim = new MarketApi();

    		final List<MarketOrdersResponse> priceBuy = apim.getMarketsRegionIdOrders("buy",(int) idRegion,"tranquility",Integer.MAX_VALUE, (int) idItem, "", "");

    		order orderBuyMax=null;

    		for (int i=0;i<priceBuy.size();i++)
    		{
    			if (priceBuy.get(i).getLocationId()==idStation)
    			{
    				if (orderBuyMax==null)
    				{
    					orderBuyMax = new order(priceBuy.get(i).getOrderId(), priceBuy.get(i).getTypeId(),priceBuy.get(i).getLocationId(),priceBuy.get(i).getVolumeTotal(),priceBuy.get(i).getPrice());
    				}
    				else
    				{
    					if (orderBuyMax.getPrice()<priceBuy.get(i).getPrice())
    					{
    						orderBuyMax = new order(priceBuy.get(i).getOrderId(), priceBuy.get(i).getTypeId(),priceBuy.get(i).getLocationId(),priceBuy.get(i).getVolumeTotal(),priceBuy.get(i).getPrice());
    					}
    				}
    			}
    		}
    		return(orderBuyMax.getPrice());
    	}
    	
    	public int getItemCategory(long idItem) throws Exception
    	{
    		final UniverseApi apiu = new UniverseApi();
   
       		TypeResponse t=apiu.getUniverseTypesTypeId((int) idItem, "tranquility", "en-us","","");
      		GroupResponse g=apiu.getUniverseGroupsGroupId((int) t.getGroupId(), "tranquility", "en-us","","");
      		return (g.getCategoryId());
    	}


		static long SearchItem(String szItem) throws ApiException
		{
			final SearchApi apis = new SearchApi();

			List<String> toSearch = new ArrayList();

			toSearch.add("inventorytype");

			net.troja.eve.esi.model.SearchResponse response= apis.getSearch(toSearch, szItem, "tranquility","en-us", true, "", "");
			String rep = response.getInventorytype().toString().replace("[", "");
			rep = rep.replace("]", "");
			return (Long.parseLong(rep));
		}

		static long SearchStation(String szSation) throws ApiException
		{
			final SearchApi apis = new SearchApi();

			List<String> toSearch = new ArrayList();

			toSearch.add("station");

			net.troja.eve.esi.model.SearchResponse response= apis.getSearch(toSearch, szSation, "tranquility","en-us", true, "", "");
			String rep = response.getStation().toString().replace("[", "");
			rep = rep.replace("]", "");
			return (Long.parseLong(rep));
		}


		static long SearchRegion(String szRegion) throws ApiException
		{
			final SearchApi apis = new SearchApi();

			List<String> toSearch = new ArrayList();

			toSearch.add("region");

			net.troja.eve.esi.model.SearchResponse response= apis.getSearch(toSearch, szRegion, "tranquility","en-us", true, "", "");
			String rep = response.getRegion().toString().replace("[", "");
			rep = rep.replace("]", "");
			return (Long.parseLong(rep));
		}

		private static Connection getConnection() throws URISyntaxException, SQLException, ClassNotFoundException {
			    URI dbUri = new URI(System.getenv("DATABASE_URL"));
			    Class.forName("org.postgresql.Driver");
			    String username = dbUri.getUserInfo().split(":")[0];
			    String password = dbUri.getUserInfo().split(":")[1];
			    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

			    return DriverManager.getConnection(dbUrl, username, password);
			}

	

		private static boolean isAsteroid(Connection conn, long idItem) throws SQLException
		{
			java.sql.Statement st = conn.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT "+ 
					  "\"invTypes\".\"typeID\","+ 
					  "\"invTypes\".\"typeName\","+ 
					  "\"invGroups\".\"groupID\","+
					  "\"invGroups\".\"groupName\","+ 
					  "\"invCategories\".\"categoryID\","+ 
					  "\"invCategories\".\"categoryName\" "+
					"FROM "+
					  "evesde.\"invCategories\","+ 
					  "evesde.\"invGroups\","+
					  "evesde.\"invTypes\" "+
					"WHERE "+
					  "\"invGroups\".\"categoryID\" = \"invCategories\".\"categoryID\" AND "+
					  "\"invTypes\".\"groupID\" = \"invGroups\".\"groupID\" AND "+
					  "\"invTypes\".\"typeID\" = "+idItem+";");
			if (rs.next())
			{
				String cat=rs.getString(6);
			    if (rs.getString(6).compareTo("Asteroid")==0)
			    {
				    rs.close();
				    st.close();
				    return(true);
			    }
			    else
			    {
			    	rs.close();
			    	st.close();
			    	return(false);
			    }
			}
			return(false);
		}
		
		private float getPriceAsteroid(Connection conn, long idRegion, long idStation,long idItem,String name,int quantity) throws Exception
		{
			float total=0;
			
			java.sql.Statement st = conn.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT \r\n" + 
				"  \"invTypes\".\"typeID\", \r\n" + 
				"  \"invTypes\".\"groupID\", \r\n" + 
				"  \"invTypes\".\"typeName\", \r\n" + 
				"  \"invGroups\".\"groupName\", \r\n" + 
				"  \"invTypeMaterials\".\"materialTypeID\", \r\n" + 
				"  \"invTypeMaterials\".quantity\r\n" + 
				"FROM \r\n" + 
				"  evesde.\"invTypes\", \r\n" + 
				"  evesde.\"invTypeMaterials\", \r\n" + 
				"  evesde.\"invGroups\"\r\n" + 
				"WHERE \r\n" + 
				"  \"invTypes\".\"typeID\" = "+idItem+" AND\r\n" + 
				"  \"invTypes\".\"typeID\" = \"invTypeMaterials\".\"typeID\" AND\r\n" + 
				"  \"invTypes\".\"groupID\" = \"invGroups\".\"groupID\";\r\n");
			while (rs.next())
			{
				float priceSellMin=getSellMin(idRegion, idStation, Long.parseLong(rs.getString(5)));
				float priceBuyMax=getBuyMax(idRegion, idStation, Long.parseLong(rs.getString(5)));

				float taxe=((float) 100- (float) 10)/ (float) 100;

				out.print("<tr>");
	      		out.print("<td>");
	      		out.print(rs.getString(3));
	      		out.print("</td>");
				out.print("<td>");
	      		out.print(rs.getString(1));
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(rs.getString(2));
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(rs.getString(4));
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(rs.getString(5));
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(rs.getString(6)+"*0.868296");
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print((priceSellMin+priceBuyMax)/2*Integer.parseInt(rs.getString(6))/100*0.868296);
	      		out.print("</td>");
	      		out.print("<td>");
				out.print(quantity);
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(String.format("%.2f", (priceSellMin+priceBuyMax)/2*Integer.parseInt(rs.getString(6))/100*quantity*0.868296));
	      		out.print("</td>");
	      		out.print("<td>");
	      		out.print(String.format("%.2f", (priceSellMin+priceBuyMax)/2*Integer.parseInt(rs.getString(6))/100*quantity*taxe*0.868296));
	      		out.print("</td>");

				total=(float) (total+(priceSellMin+priceBuyMax)/2*Integer.parseInt(rs.getString(6))/100*quantity*taxe*0.868296);
	      		out.print("</tr>");
			}
			rs.close();
			st.close();
			return (total);
		}

		private float getPrice(Connection conn, long idRegion, long idStation,long idItem,String name,int quantity) throws Exception
		{
			float total=0;
			float taxe=0;
			
			int CategoryId=getItemCategory(idItem);

      		if ((CategoryId==4) || 
      				(CategoryId==17) ||
      				(CategoryId==25) ||
      				(CategoryId==32) ||
      				(CategoryId==34) ||
      				(CategoryId==35) ||
      				(CategoryId==42) ||
      				(CategoryId==43))
      		{
       			taxe=((float) 100- (float) 10)/ (float) 100;
      		}
      		else
      		{
      			taxe=((float) 100- (float) 50)/ (float) 100;
     		}

			float priceSellMin=getSellMin(idRegion, idStation, idItem);
			float priceBuyMax=getBuyMax(idRegion, idStation, idItem);
      		
      		out.print("<tr>");
      		out.print("<td>");
      		out.print(name);
      		out.print("</td>");
      		out.print("<td>");
      		out.print(idItem);
      		out.print("</td>");
      		out.print("<td>");
      		out.print(CategoryId);
      		out.print("</td>");
      		out.print("<td>");
      		out.print("");
      		out.print("</td>");
      		out.print("<td>");
      		out.print("");
      		out.print("</td>");
      		out.print("<td>");
      		out.print("");
      		out.print("</td>");
      		out.print("<td>");
      		out.print((priceSellMin+priceBuyMax)/2);
      		out.print("</td>");
      		out.print("<td>");
			out.print(quantity);
      		out.print("</td>");
      		out.print("<td>");
      		out.print(String.format("%.2f", (priceSellMin+priceBuyMax)/2*quantity));
      		out.print("</td>");
      		out.print("<td>");
      		out.print(String.format("%.2f", (priceSellMin+priceBuyMax)/2*quantity*taxe));
      		out.print("</td>");
      		out.print("</tr>");
      		
      		total=(priceSellMin+priceBuyMax)/2*quantity*taxe;
			
      		return (total);
		}

}
