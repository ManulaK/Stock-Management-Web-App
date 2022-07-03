package com.StockServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataObjectAccess.ProductDBUtill;

@WebServlet("/RemoveProductServlet")
public class RemoveProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int pid =Integer.parseInt(request.getParameter("Pid"));
		
		ProductDBUtill.removeProduct(pid);
		
		RequestDispatcher dis=request.getRequestDispatcher("Admin_index.jsp");
		dis.forward(request, response);

	}

}
