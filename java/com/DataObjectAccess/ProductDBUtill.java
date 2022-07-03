package com.DataObjectAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.StockModels.Product;


public class ProductDBUtill implements DataBaseConnector {
	
	public static Statement stmt = null;
	public static Connection conn = null;
	
	
	//Data Base Connection Method Implementation
	public static Connection getConnection( ){

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con=DriverManager.getConnection(url, dbusername, dbpasword);
		}
		catch(Exception e) {
			System.out.println("Could not connect to the database");
		}

		return con;

	}
	
	
	     //Method for insert products
	     public static boolean insertProduct(String product_name,double product_price,String product_Brand,
			String SellerId,String productInfo, String productType, String productQty) {
		
		 boolean isSuccess = false;
		
		    
		    try {
		    	
		    	conn = getConnection();
		    	stmt = conn.createStatement(); 
		    	//Sequel quarry to insert data into the table
		    	String sql = "INSERT INTO stocks VALUES "+ "(0,'"+product_name+"','"+product_price+"','"+product_Brand+"','"+SellerId+"', '"+productInfo+"', '"+ productType+"', '"+productQty+"')";
		    	
		    	int rs = stmt.executeUpdate(sql);
		    	
		    	if(rs > 0) {
		    		isSuccess = true;
		    	}else {
		    		isSuccess = false;
		    	}
		    	
		    }catch(Exception e) {
		    	e.printStackTrace(); 
		    }
		    
		 return isSuccess;
		 
		
	}
	
	     
	
	     //Method for update products
	    public static boolean updateProduct(int pid , double price) {
		
		
		int result = 0;
		boolean validity=false;

		
		try {
			
			conn= getConnection();
			stmt = conn.createStatement();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		String sql="UPDATE stocks SET product_price = '"+price+"' WHERE PID ='"+pid+"' ";
		
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		  if(result > 0) {
			
			validity = true;
		  }

		return validity;
	}
	
	
	
	//Method for  delete products
	
	public static boolean removeProduct(int pid ) {
		
		int result = 0;
		boolean validity=false;

		
		try {
			
			conn= getConnection();
			stmt = conn.createStatement();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		String sql="DELETE FROM stocks WHERE PID ='"+pid+"' ";
		
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		if(result > 0) {
			
			validity = true;
		}

		return validity;
	}

	
	
	//Method for retrieving products details
	public static List<Product>getProductdetails(){
	
		ArrayList<Product> pds = new ArrayList<>();
		
		
		try {
			
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql  ="select * from stocks";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Double price = rs.getDouble(3);
				String brand = rs.getString(4);
				String seller = rs.getString(5);
				String info = rs.getString(6);
				String type = rs.getString(7);
				String quality = rs.getString(8);
				
				Product p =new Product(id ,name,price,brand,seller,info,type,quality);
				pds.add(p);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pds;
	}
}




















