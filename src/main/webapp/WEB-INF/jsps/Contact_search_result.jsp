<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact search result</title>
</head>
<body>
       <h2>Contact Search Result....</h2>
       
       <table border="5">
          <tr>
             <th>Id</th>
             <th>FirstName</th>
             <th>LastName</th>
             <th>LeadSource</th>
             <th>Email</th>
             <th>Mobile</th>
             <th>Billing</th>
           </tr>
              <c:forEach items="${contacts}" var="contact">
                  <tr>
		             <td>${contact.id}</td>
		             <td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
		             <td>${contact.lastName}</td>
		             <td>${contact.leadSource}</td>
		             <td>${contact.email}</td>
		             <td>${contact.mobile}</td>
		             <td><a href="billInfo?id=${contact.id}">billing</a></td>
                 </tr>
              </c:forEach>
       </table>
       
</body>
</html>