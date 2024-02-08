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

      form {
        border-radius: 5px;
        border: 1px #f2f2f2 solid;
        padding: 1rem;
      }

      input, select {
        /* width: 100%; */
        border-radius: 5px;
        border: 1px #f2f2f2 solid;
        padding: 0.5rem 0.75rem;
      }

      button {
        margin-left: auto;
        margin-right: auto;
        border-radius: 5px;
      }

      #form-container {
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
      }
    </style>
  </head>
  <body>
    <div id="form-container">
      <form action="UserRegisterServlet" method="POST">
        <label for="username">Username</label>
        <input
          type="text"
          name="username"
          placeholder="Username"
          id="username"
          required
        />
        <br />
        <br />
        <label for="password">Password</label>
        <input
          type="password"
          name="password"
          placeholder="Password"
          id="password"
          required
        />
        <br />
        <br />
        <label for="role">Role</label>
         <select name="role" id="role" required>
           <option value="admin">Admin</option>
           <option value="user">User</option>
         </select>
        <br />
        <br />
        <div style="text-align: center">
          <button type="submit">Register</button>
        </div>
      </form>
    </div>
  </body>
</html>
