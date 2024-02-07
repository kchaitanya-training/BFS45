<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.container {
  display: flex;
  width:30px
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% if((String)request.getAttribute("loginerror")!=null) {%>
<h4 style="color: red"><% out.print((String)request.getAttribute("loginerror")); %></h4>
<%} %>

<form action="loginServlet" method="post">

<div class="container"><h4 style="color:blue; flex:1;"> userName </h4>
<input    type="text"  name="userId"/></div>


<br/><br/>
<div class="container">
<h4 style="color:blue;"> password </h4>
<input type="password"  name="password"/>
</div>
<input type="submit" value="Login">

</form>

</body>
</html>