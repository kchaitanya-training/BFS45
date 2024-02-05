<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="registry" method="post">


<div class="container"><h4 style="color:blue; flex:1;"> userName </h4>
<input    type="text"  name="username"/></div>


<br/><br/>
<div class="container">
<h4 style="color:blue;"> password </h4>
<input type="password"  name="password"/>
</div>


<br/><br/>
<div class="container">
<h4 style="color:blue;"> Role </h4>
<select name="role">
    <option > admin </option>
 <option>user</option>
</select>
<br/><br/>

</div>
<input type="submit" value="Account_Creationg">

</form>

</body>
</html>