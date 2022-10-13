<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead search result</title>
</head>
<body>
       <h2>Lead Search Result....</h2>
       <a href="view">Create Lead</a>
       
       <table border="5">
          <tr>
             <th>Id</th>
             <th>FirstName</th>
             <th>LastName</th>
             <th>LeadSource</th>
             <th>Email</th>
             <th>Mobile</th>
             <th>Update</th>
           </tr>
              <c:forEach items="${leads}" var="lead">
                  <tr>
		             <td>${lead.id}</td>
		             <td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
		             <td>${lead.lastName}</td>
		             <td>${lead.leadSource}</td>
		             <td>${lead.email}</td>
		             <td>${lead.mobile}</td>
		             <td><a href="updateInfo?id=${lead.id}">update</a></td>
                 </tr>
              </c:forEach>
       </table>
       
</body>
</html>