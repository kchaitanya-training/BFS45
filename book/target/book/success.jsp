<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Register</title>
    <style>
      body {
        font-family: Arial, Helvetica, sans-serif;
      }

      #container {
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
      }

      #container div {
        border-radius: 5px;
        border: 1px #f2f2f2 solid;
        padding: 1rem;
        text-align: center;
       }
    </style>
  </head>
  <body>
    <div id="container">
      <div>
        <h4>User <i>${username}</i> registered as <i>${role}</i></h4>
        <hr />
        <small>User ID: ${userID}</small>
      </div>
    </div>
  </body>
</html>
