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

<form action="orderBook" method="post">
<table>
	<% Book book= (Book)request.getAttribute("book");%>
	
	<input type="hidden" name="book_id" value="<%=book.getBookId() %>">
	<input type="hidden" name="user_id" value="<%=request.getAttribute("userid") %>">
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
<button type="submit" name="buttonid" value="order">CONFIRM ORDER</button>

</form>
</body>
</html>