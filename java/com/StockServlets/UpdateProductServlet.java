package com.StockServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataObjectAccess.ProductDBUtill;


@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("updateProductservlet");
		
		int pid =Integer.parseInt(request.getParameter("Pid"));
		Double Price = Double.parseDouble(request.getParameter("Price"));

		
		ProductDBUtill.updateProduct(pid, Price);
		
		RequestDispatcher dis=request.getRequestDispatcher("Admin_index.jsp");
		dis.forward(request, response);

	}

}
