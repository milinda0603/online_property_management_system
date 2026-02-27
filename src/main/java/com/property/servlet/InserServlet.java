package com.property.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.property.service.PaymentController;


@WebServlet("/InserServlet")
public class InserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String paymentoption = request.getParameter("paymentoption");  // Match form field name exactly
	        String NameofCard = request.getParameter("NameofCard");
	        String Amount = request.getParameter("Amount");
	        String CardNumber = request.getParameter("CardNumber");
	        String ExpMonth = request.getParameter("ExpMonth");
	        String ExpYear = request.getParameter("ExpYear");
	        String cvv = request.getParameter("cvv");
	        
	        boolean isTrue = PaymentController.insertdata(paymentoption, NameofCard, Amount, CardNumber, ExpMonth, ExpYear, cvv);

	        
	        if (isTrue==true) {
	            String alertMessage = "Insert successful";
	            response.getWriter().println("<script> alert('" + alertMessage + "'); window.location.href='PaymentGetAll'; </script>");
	        } else {
	            RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
	            dis2.forward(request, response);
	        }
		
	}

}
