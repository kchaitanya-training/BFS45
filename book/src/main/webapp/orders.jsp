<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.bfs45.book.model.Order" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>All Books</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        .container {
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .header {
            display: flex;
            align-items: center;
            justify-content: space-between;
        }

        table {
            border-radius: 5px;
        }

        table, th, td {
            border: 1px gray solid;
            text-align: center;
        }

        th, td {
            width: 10rem;
        }
    </style>
</head>
<body>
<div class="container">
    <div>
        <div class="header">
            <div class="header">
                <h3><a href="/book/BookServlet">All Books</a></h3>
                <span style="margin-left: 1rem; margin-right: 1rem"> | </span>
                <h3>All Orders</h3>
            </div>
            <div>
                Welcome ${user} (${role})
            </div>
        </div>
        <hr />
        <br />
        <form action="/book/DeleteOrderServlet" method="POST">
            <table>
                <thead>
                <th style="width: 1%"></th>
                <th>Order ID</th>
                <th>Book</th>
                <th>User</th>
                </thead>
                <tbody>
                <% List<Order> orders= (ArrayList<Order>)request.getAttribute("allOrders");
                    for(Order order:orders){
                    %>
                    <tr>
                        <td><input type="checkbox" name="listoforderid" value="<%= order.getOrderID()%>"/></td>
                        <td><%= order.getOrderID() %></td>
                        <td><%= order.getBook().getBookName() %></td>
                        <td><%= order.getUser().getUsername() %></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            <br />
            <div style="text-align: center;">
                <button type="submit">Delete</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
