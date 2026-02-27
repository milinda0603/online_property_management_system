package com.property.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.property.model.insertpay;
import com.property.service.PaymentController;


@WebServlet("/PaymentGetAll")
public class PaymentGetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <insertpay> allpay = PaymentController.getAllPay();
		request.setAttribute("allpay", allpay);
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("PayDetails.jsp");
	dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
	
}
