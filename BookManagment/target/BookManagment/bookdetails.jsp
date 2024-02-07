<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
      <%@ page import="com.bfs45.bookmanagment.model.Book" %>
     <%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<% Set<Book> books= (Set<Book>)request.getAttribute("bookDetails");
for(Book book:books){
%>

<h1><%book.getBookName(); %></h1>
<%} %>

</tbody>

</table>
</body>
</html>