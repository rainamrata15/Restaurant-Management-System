<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Food</title>
</head>
<body>

<h2>Add Chinese Food Item</h2>

<form action="${pageContext.request.contextPath}/AddFoodServlet" method="post">

    Food Name:
    <input type="text" name="name"><br><br>

    Category:
    <input type="text" name="category" value="Chinese"><br><br>

    Price:
    <input type="number" step="0.01" name="price"><br><br>
    
    Image Name:
	<input type="text" name="image"><br><br>

    <input type="submit" value="Add Food">

</form>

</body>
</html>