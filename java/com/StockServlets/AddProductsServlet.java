package com.StockServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataObjectAccess.ProductDBUtill;



@WebServlet("/AddProductsServlet")
public class AddProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String product_name = request.getParameter("product_name");
		double product_price = Double.parseDouble(request.getParameter("product_price"));
		String product_Brand = request.getParameter("product_Brand");
		String SellerId = request.getParameter("SellerId");
		String productInfo = request.getParameter("productInfo");
		String productType = request.getParameter("productType");
		String productQty = request.getParameter("productQty");
	

		
		boolean isTrue;
		isTrue = ProductDBUtill.insertProduct(product_name, product_price, product_Brand,SellerId,productInfo ,productType,productQty);
		
		//if database connection success
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("showSuccess.jsp");
			dis.forward(request, response); 
		}else {
			//if not
			RequestDispatcher dis_not = request.getRequestDispatcher("showUnSuccess.jsp");
			dis_not.forward(request, response); 
		}
		
	}

}
