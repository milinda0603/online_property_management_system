<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Payment Form</title>
    <link rel="stylesheet"  href="css/style.css">
    
</head>
<body>
  <form method="POST" action="InserServlet">
        <div class="details">
            <h1>PAYMENT OPTION</h1>
            <h3>Please choose your payment option here.</h3>
            <p>
                <input type="radio" name="paymentoption" value="CreditCards" required>Credit Cards 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/cards_img.jpg" width="30%" alt="image"><br>

                <input type="radio" name="paymentoption" value="PayPal">PayPal 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/PayPal-Logo.png" width="30%"><br>

                <input type="radio" name="paymentoption" value="BankDeposit">Bank Deposit/Bank Transfer 
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/images_bank.jpg" width="30%">
            </p>

            <h3>Please enter your credit card details below.</h3>
            <p>Name of Card Holder: <input type="text" name="NameofCard" placeholder="Mr. John Doe" required></p>
            <p>Amount: <input type="number" name="Amount" placeholder="Rs." required></p>

            <p>Card Number: <input type="text" name="CardNumber" placeholder="1111-2222-3333-4444" maxlength="19" required></p>
            
            <p>
                ExpMonth:
                <select name="ExpMonth" required>
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
                <select name="ExpYear" required>
                    <option value="">Select Year</option>
                    <option value="2023">2023</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                </select>
                
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <br><br>CVV:
                <input type="text" name="cvv" placeholder="123" maxlength="3" required>
            </p>
            
            <button type="submit">Confirm</button>
        </div>
    </form> 
</body>
</html>
