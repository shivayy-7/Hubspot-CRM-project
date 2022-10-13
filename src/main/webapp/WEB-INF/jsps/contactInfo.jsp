<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
        <h2>Contact Info....</h2>
        
         <div>${sent}</div>
        
        Id: ${contact.id}<br/>
        FirstName: ${contact.firstName}<br/>
        LastName: ${contact.lastName}<br/>
        LeadSource: ${contact.leadSource}<br/>
        Email: ${contact.email}<br/>
        Mobile: ${contact.mobile}<br/>
        
        <form action="sendEmailContact" method="post">
          <input type="hidden" name="email" value="${contact.email}"/>
          <input type="hidden" name="id" value="${contact.id}"/>
          <input type="submit" value="send email"/>
        </form>
        
        
</body>
</html>