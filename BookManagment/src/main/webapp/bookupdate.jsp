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

<form action="bookUpdate" method="post">
<table>
	<% Book book= (Book)request.getAttribute("book");%>
	<% book.getBookName(); %>
	
	<input type="hidden" name="id" value="<%=book.getBookId() %>">
	<tr >
	<td>Book Name:</td>
	<td><input type="text" name="bname" value="<%=book.getBookName() %>"></td>
	</tr>
	<tr>
	<td>Description:</td>
	<td><input type="text" name="description" value="<%=book.getBookDescription() %>"></td>
	</tr>
	<tr>
	<td>Price:</td>
	<td><input type="text" name="price" value="<%=book.getBookPrice()%>"></td>
	</tr>

</table>
<br>
<input type="submit" value="UPDATE" name="update">

</form>
</body>
</html>