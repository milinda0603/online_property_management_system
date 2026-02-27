<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		
	String id = request.getParameter("id");
	String paymentoption = request.getParameter("paymentoption");  // Match form field name exactly
    String NameofCard = request.getParameter("NameofCard");
    String Amount = request.getParameter("Amount");
    String CardNumber = request.getParameter("CardNumber");
    String ExpMonth = request.getParameter("ExpMonth");
    String ExpYear = request.getParameter("ExpYear");
    String cvv = request.getParameter("cvv");
	%>

<form method="POST" action="UpdateServlet">
        <div class="details">
        
        	<p>Id: <input type="text" name="id" value="<%=id%>" readonly></p>
            <h1>PAYMENT OPTION</h1>
            
            <h3>Please choose your payment option here.</h3>
            
            
            
            <p>
                <input type="radio" name="paymentoption" value="<%=paymentoption%>" required>Credit Cards 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/cards_img.jpg" width="30%" alt="image"><br>

                <input type="radio" name="paymentoption" value="<%=paymentoption%>">PayPal 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/PayPal-Logo.png" width="30%"><br>

                <input type="radio" name="paymentoption" value="<%=paymentoption%>">Bank Deposit/Bank Transfer 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/images_bank.jpg" width="30%">
            </p>

            <h3>Please enter your credit card details below.</h3>
            <p>Name of Card Holder: <input type="text" name="NameofCard" value="<%=NameofCard%>" placeholder="Mr.John Doe" required></p>
            <p>Amount: <input type="number" name="Amount" value="<%=Amount%>" placeholder="Rs." required></p>

            <p>Card Number: <input type="text" name="CardNumber" value="<%=CardNumber%>" placeholder="1111-2222-3333-4444" maxlength="19" required></p>
            
            <p>
                ExpMonth:
                <select name="ExpMonth"  value="<%=ExpMonth%>" required>
                    <option value="">Select Month</option>
                    <option value="January">January</option>
                    <option value="February">February</option>
                    <option value="March">March</option>
                    <option value="April">April</option>
                    <option value="May">May</option>
                    <option value="June">June</option>
                    <option value="July">July</option>
                    <option value="August">August</option>
                    <option value="September">September</option>
                    <option value="October">October</option>
                    <option value="November">November</option>
                    <option value="December">December</option>
                </select>
                
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                ExpYear:
                <select name="ExpYear"  value="<%=ExpYear%>" required>
                    <option value="">Select Year</option>
                    <option value="2023">2023</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                </select>
                
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <br><br>CVV:
                <input type="text" name="cvv" value="<%=cvv%>" placeholder="123" maxlength="3" required>
            </p>
            
            <button type="submit">Confirm</button>
        </div>
    </form>

</body>
</html>