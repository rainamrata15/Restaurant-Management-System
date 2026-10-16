<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login</title>
</head>
<body>

<h2>Customer Login</h2>

<form action="CustomerLoginServlet" method="post">

    Email:
    <input type="email" name="email"><br><br>

    Password:
    <input type="password" name="password"><br><br>

    <input type="submit" value="Login">

</form>

</body>
</html>