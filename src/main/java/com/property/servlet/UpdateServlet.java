package com.property.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.property.model.insertpay;
import com.property.service.PaymentController;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
				String id= request.getParameter("id");
			    String paymentoption = request.getParameter("paymentoption");  // Match form field name exactly
		        String NameofCard = request.getParameter("NameofCard");
		        String Amount = request.getParameter("Amount");
		        String CardNumber = request.getParameter("CardNumber");
		        String ExpMonth = request.getParameter("ExpMonth");
		        String ExpYear = request.getParameter("ExpYear");
		        String cvv = request.getParameter("cvv");
		        
		        boolean isTrue ;
		        isTrue = PaymentController.updatedata(id, paymentoption, NameofCard, Amount, CardNumber, ExpMonth, ExpYear, cvv);
	
		        if (isTrue==true) { 
		        	List<insertpay> paydetails = PaymentController.getById(id);
		        	request.setAttribute("paydetails", paydetails);
		            String alertMessage = "Insert successful";
		            response.getWriter().println("<script> alert('" + alertMessage + "'); window.location.href='PaymentGetAll'; </script>");
		        } else {
		            RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
		            dis2.forward(request, response);
		        }
	}

}
