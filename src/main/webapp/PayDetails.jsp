<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"  href="css/DisplayPay.css">
</head>
<body>
<h1>Payment Details</h1>

    <table >
      <tr>
      	 <th>id</th>
         <th>Payment Option</th>
         <th>Name of Card</th>
         <th>Amount</th>
         <th>Card Number</th>
         <th>Expiration Month</th>
         <th>Expiration Year</th>
         <th>CVV</th>
         <th>Action</th>
         
      </tr>
      <c:forEach var="pay" items="${allpay}">
      
       <tr>
          <td>${pay.id}</td>
          <td>${pay.paymentoption}</td>
          <td>${pay.nameofCard}</td>
          <td>${pay.amount}</td>
          <td>${pay.cardNumber}</td>
          <td>${pay.expMonth}</td>
          <td>${pay.expYear}</td>
          <td>${pay.cvv}</td>
          <td>
          	<a href="update.jsp?id=${pay.id}&paymentoption=${pay.paymentoption}&nameofCard=${pay.nameofCard}&amount=${pay.amount}&cardNumber=${pay.cardNumber}&expMonth=${pay.expMonth}&expYear=${pay.expYear}&cvv=${pay.cvv}">
          		<button>Update</button>
          	
          	</a>
          	
          	<form action ="DeleteServlet" method="post">
          		<input type="hidden" name="id" value="${pay.id}">
          		<button>Delete</button>
          	</form>
 
          	</td>
      </tr>
      </c:forEach>
    </table>
      
</body>
</html>