<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create bill</title>
</head>
<body>
        <h2>Billing....</h2>
        
        <form action="createBill" method="post">
          <pre>
              Id<input type="text" name="id" value="${contact.id}" readonly/>
              FirstName<input type="text" name="firstName" value="${contact.firstName}" readonly/>
              LastName<input type="text" name="lastName" value="${contact.lastName}" readonly/>
              Email<input type="email" name="email" value="${contact.email}" readonly/>
              Mobile<input type="text" name="mobile" value="${contact.mobile}" readonly/>
              Product<input type="text" name="product" />
              Amount<input type="text" name="amount" />
              <input type="submit" value="create bill"/>
          </pre>
        </form>
</body>
</html>