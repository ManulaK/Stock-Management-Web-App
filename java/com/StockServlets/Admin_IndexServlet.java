package com.StockServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataObjectAccess.ProductDBUtill;
import com.StockModels.Product;


@WebServlet("/Admin_IndexServlet")
public class Admin_IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val1 = request.getParameter("view");
		String val2 = request.getParameter("addProduct");
		String val3 = request.getParameter("Update");
		String val4 = request.getParameter("remove");
		
		
		if(val1 != null) {
			List<Product> pdsDetails = ProductDBUtill.getProductdetails();
			request.setAttribute("pdsDetails", pdsDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("ViewProduct.jsp");
			dis.forward(request, response);
			
		}
		else if(val2 != null) {
			RequestDispatcher dis=request.getRequestDispatcher("AddProduct.jsp");
			dis.forward(request, response);
			System.out.print("add");
		}
		else if(val3 != null) {
			RequestDispatcher dis=request.getRequestDispatcher("UpdateProduct.jsp");
			dis.forward(request, response);
			System.out.print("update");
		}
		else if(val4 != null) {
			RequestDispatcher dis=request.getRequestDispatcher("RemoveProduct.jsp");
			dis.forward(request, response);
			System.out.print("remove");
		}
		
		
	}

}
