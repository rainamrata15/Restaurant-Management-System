<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<style>

body{
    font-family: Arial, sans-serif;
    background-color:#f4f4f4;
    text-align:center;
}

.container{
    margin-top:100px;
}

.btn{
    display:block;
    width:250px;
    margin:15px auto;
    padding:12px;
    background-color:#4CAF50;
    color:white;
    text-decoration:none;
    border-radius:5px;
    font-size:18px;
}

.btn:hover{
    background-color:#45a049;
}

</style>

</head>
<body>

<div class="container">

    <h1>🍴Spice & Slice🍴</h1>
    <h2>Admin Dashboard</h2>

    <a href="addFood.jsp" class="btn">Add Food Item</a>

    <a href="viewFood.jsp" class="btn">View Food Items</a>

    <a href="viewOrders.jsp" class="btn">View Orders</a>

    <a href="adminLogin.jsp" class="btn">Logout</a>

</div>

</body>
</html>