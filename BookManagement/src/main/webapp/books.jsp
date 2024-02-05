<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.sajan.bookmanagement.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
      body {
                  font-family: Arial, sans-serif;
                  background-color: #f4f4f4;
                  margin: 0;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                  height: 100vh;
              }

              table {
                  width: 70%;
                  border-collapse: collapse;
                  margin: 20px;
              }

              th, td {
                  border: 1px solid #dddddd;
                  text-align: left;
                  padding: 8px;
              }

              th {
                  background-color: #f2f2f2;
              }

              input[type="checkbox"] {
                  transform: scale(1.5);
                  margin-right: 5px;
              }

              input[type="submit"], .order-btn, .update-btn {
                  background-color: #4CAF50;
                  color: white;
                  padding: 10px 15px;
                  border: none;
                  border-radius: 5px;
                  cursor: pointer;
                  margin-right: 10px;
              }

              input[type="submit"]:hover, .order-btn:hover, .update-btn:hover {
                  background-color: #45a049;
              }
    </style>
    <meta charset="UTF-8">
    <title>Book List</title>
</head>
<body>

    <form action="adminServlet" method="post">
        <table>
            <thead>
                <tr>
                    <th>Select</th>
                    <th>Book Name</th>
                </tr>
            </thead>
            <tbody>
            <% String role = (String)request.getAttribute("role"); %>
                <%
                    List<Book> books = (List<Book>)request.getAttribute("books");
                    for (Book book : books) {
                %>
                    <tr>
                        <td><input type="checkbox" name="listofbookid" value="<%= book.getBookId() %>"></td>
                        <td><%= book.getBookName() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        <br>
        <div>
            <form action="adminServlet" method="post">
                <% if("admin".equalsIgnoreCase(role)) { %>
                    <input type="submit" value="Update" name="buttonId">
                <% } else { %>
                    <input type="submit" value="Order" name="buttonId">
                <% } %>
            </form>
        </div>
    </form>

</body>
</html>
