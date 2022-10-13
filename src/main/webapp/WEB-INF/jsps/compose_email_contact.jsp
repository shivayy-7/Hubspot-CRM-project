<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose mail</title>
</head>
<body>
        <h2>Compose mail in contact....</h2>
        
       
        <form action="composeEmailContact" method="post">
            <pre>
                <input type="hidden" name="id" value=${id}>
                To<input type="text" name="to" value="${email}" readonly/>
                Subject<input type="text" name="sub" />
                <textarea  name="body" rows="20" cols="50">
                  
                     </textarea>
                <input type="submit" value="send email"/>
            </pre>
        </form>
</body>
</html>