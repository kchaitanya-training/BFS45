<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.bfs45.book.model.Book" %>

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
                <h3>All Books</h3>
                <% String role=(String)request.getAttribute("role");%>
                <% if(role.equals("admin")){ %>
                <span style="margin-left: 1rem; margin-right: 1rem"> | </span>
                <h3><a href="/book/OrderServlet">All Orders</a></h3>
                <% }%>
            </div>

            <div>
                Welcome ${user} (${role})
            </div>
        </div>
        <hr />
        <br />
        <form action="/book/BookOrderServlet" method="POST">
            <table>
                <thead>
                <th style="width: 1%"></th>
                <th>Name</th>
                <th>Author</th>
                <th>Description</th>
                <th>Price</th>
                </thead>
                <tbody>
                <% List<Book> books= (ArrayList<Book>)request.getAttribute("allBooks");
                    for(Book book:books){
                    %>
                    <tr>
                        <td><input type="checkbox" name="listofbookid" value="<%= book.getBookID()%>"/></td>
                        <td><%= book.getBookName() %></td>
                        <td><%= book.getBookAuthor() %></td>
                        <td><%= book.getBookDescription() %></td>
                        <td><%= book.getBookPrice() %></td>
                    </tr>
                    <%} %>
                </tbody>
            </table>
            <br />
            <div style="text-align: center;">
                <button type="submit">Order</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
