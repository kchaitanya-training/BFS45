<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.bfs45.bookmanagment.model.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="deleteBook" method="post">
<table>
	<% Book book= (Book)request.getAttribute("book");%>
	<% book.getBookName(); %>
	
	<input type="hidden" name="id" value="<%=book.getBookId() %>">
	<input type="hidden" name="role" value="<%=request.getAttribute("role") %>">
	<tr>
	    <td>Book Name:</td>
	    <td><span><%=book.getBookName() %></span></td>
	</tr>
	<tr>
	    <td>Description:</td>
	    <td><span><%=book.getBookDescription() %></span></td>
	</tr>
	<tr>
	    <td>Price:</td>
	    <td><span><%=book.getBookPrice()%></span></td>
	</tr>

</table>
<br>
<button type="submit" name="buttonid" value="delete">CONFIRM DELETE</button>

</form>
</body>
</html>