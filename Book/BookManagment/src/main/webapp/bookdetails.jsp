<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
      <%@ page import="com.bfs45.bookmanagment.model.Book" %>
     <%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="ISO-8859-1">

</head>
<body>

<form action="bookControllerServlet" method="post">
<h2>Book Inventory</h2>
<table>
    <thead>
      <tr>
        <th>Select</th>
        <th>Book Name</th>
        <th>Book Description</th>
        <th>Book Price</th>
      </tr>
    </thead>
    <tbody>
      <% String role = (String)request.getAttribute("role");
         Set<Book> books = (Set<Book>)request.getAttribute("bookDetails");
         for (Book book : books) {
      %>
	<tr >
	<td><input type="checkbox" name="listofbookid" value="<%= book.getBookId() %>"></td>
	<td><%= book.getBookName() %></td>
	<td><%= book.getBookDescription() %></td>
	<td><%= book.getBookPrice() %></td>
	</tr>
	<%} %>
</table>
<br>
<%if("user".equals(role)){ %>
<button type="submit" name="buttonid" value="order">ORDER</button>
<% }else if("admin".equals(role)){ %>
<button type="submit" name="buttonid" value="update">UPDATE</button>
<button type="submit" name="buttonid" value="add">ADD</button>
<button type="submit" name="buttonid" value="delete">DELETE</button>
<% }%>
<button type="submit" name="buttonid" value="orderedList">ORDERED LIST</button>
</form>
</body>
</html>