<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
      <%@ page import="com.bfs45.bookmanagment.model.Order" %>
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
<h2>Book Ordered List</h2>

<table>

    <thead>
      <tr>
        <th>Order Id</th>
        <% String userRole = Objects.toString(request.getAttribute("role"));
        if (userRole.equals("admin")) { %>
            <th>User Id</th>
        <% } %>
        <th>Book Id</th>
        <th>Order Status</th>
      </tr>
    </thead>
    <tbody>
      <% 
         Set<Order> orders = (Set<Order>)request.getAttribute("ordersList");
         for (Order order : orders) {
      %>
      
	<tr >
	<td><%= order.getOrderId() %></td>
    <% if (userRole.equals("admin")) { %>
    	<td><%= order.getUserId() %></td>
    <% } %>
	<td><%= order.getBookId() %></td>
	<td><%= order.getStatus() %></td>
	</tr>
	<%} %>
</table>
<br>
<button type="submit" name="buttonid" value="bookList">BOOK LIST</button>
</form>
</body>
</html>