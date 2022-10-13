<%@ page language="java" contentType="text/json; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update lead</title>
</head>
<body>
        <h2>Update Lead Info....</h2>
        
        <form action="update" method="post">
           <pre>
               Id<input type="text" name="id" value="${lead.id}" readonly/>
               FirstName<input type="text" name="firstName" value="${lead.firstName}" />
               LastName<input type="text" name="lastName" value="${lead.lastName}" />
               LeadSource<input type="text" name="leadSource" value="${lead.leadSource}" />
               Email<input type="email" name="email" value="${lead.email}" />
               Mobile<input type="number" name="mobile" value="${lead.mobile}" />
               <input type="submit" value="update" />
           </pre>
        </form>
</body>
</html>