<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.CartItem"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Cart</title>
</head>
<body>

<h2>Shopping Cart</h2>

<table border="1" cellpadding="10">

<tr>
    <th>Food Name</th>
    <th>Price</th>
    <th>Quantity</th>
</tr>

<%
List<CartItem> cart =
    (List<CartItem>)session.getAttribute("cart");

double total = 0;

if(cart != null){

for(CartItem item : cart){

total += item.getPrice() * item.getQuantity();
%>

<tr>

<td><%= item.getFoodName() %></td>

<td>₹ <%= item.getPrice() %></td>

<td><%= item.getQuantity() %></td>

</tr>

<%
}
}
%>

</table>

<h3>Total Amount: ₹ <%= total %></h3>
<form action="PlaceOrderServlet" method="post">

    <input type="hidden"
           name="totalAmount"
           value="<%= total %>">

    <input type="submit"
           value="Place Order">

</form>

</body>
</html>