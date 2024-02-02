<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginServlet" method="post">
<!-- Text input field -->
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <br><br>

        <!-- Password input field -->
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <br><br>
        
        <button type="submit">Submit</button>
</form>
</body>
</html>