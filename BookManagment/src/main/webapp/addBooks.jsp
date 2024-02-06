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

<form action="addBook" method="post">
<input type="hidden" name="role" value="<%=request.getAttribute("role") %>">
<table>

	<tr >
	<td>Book Name:</td>
	<td><input type="text" name="bname" value=""></td>
	</tr>
	<tr>
	<td>Description:</td>
	<td><input type="text" name="description" value=""></td>
	</tr>
	<tr>
	<td>Price:</td>
	<td><input type="text" name="price" value=""></td>
	</tr>

</table>
<br>
<input type="submit" value="ADD" name="add">

</form>
</body>
</html>