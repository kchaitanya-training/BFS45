<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    </style>
</head>
<body>
<div class="container">
    <table>
        <thead>
        <th>Book ID</th>
        <th>Book Name</th>
        <th>Book Author</th>
        <th>Book Description</th>
        <th>Book Price</th>
        </thead>
        <tbody>
        <c:forEach var="book" items="${allBooks}">
            <tr>
                <td><input type="checkbox" name="listofbookid" value="${book.getBookID()}"/></td>
                <td>${book.getBookName()}</td>
                <td>${book.getBookAuthor()}</td>
                <td>${book.getBookDescription()}</td>
                <td>${book.getBookPrice()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
