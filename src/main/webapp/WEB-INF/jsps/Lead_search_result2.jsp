<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
[
              {<c:forEach items="${leads}" var="lead">
                  <tr>
		             ${lead.id}
		              href="leadInfo?id=${lead.id}">${lead.firstName}
		             <td>${lead.lastName}</td>
		             <td>${lead.leadSource}</td>
		             <td>${lead.email}</td>
		             <td>${lead.mobile}</td>
		             <td><a href="updateInfo?id=${lead.id}">update</a></td>
                 </tr>
              </c:forEach>}
       </table> ]
       
</body>
</html>