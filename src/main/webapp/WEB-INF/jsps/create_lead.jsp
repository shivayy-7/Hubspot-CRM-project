<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
       <h2>Create Lead....</h2>
       
       <div>${msg}</div>
       
       <form action="saveLead" method="post">
          <pre>
             FirstName:<input type="text" placeholder="firstname" name="firstName"/>
             LastName:<input type="text" placeholder="lastname" name="lastName"/>
             LeadSource:<select name="leadSource" >
						  <option value="newspaper">NewsPaper</option>
						  <option value="tv">Tv</option>
						  <option value="online">Online</option>
						  <option value="reference">Reference</option>
						</select>
             Email:<input type="email" placeholder="email" name="email"/>
             Mobile:<input type="number" placeholder="mobile" name="mobile"/>
             <input type="submit" value="save"/>
          </pre>
       </form>
</body>
</html>