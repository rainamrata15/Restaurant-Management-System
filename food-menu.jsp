<%@ page import="java.util.List" %>
<%@ page import="dao.FoodDAO" %>
<%@ page import="model.Food" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Food Menu</title>
</head>
<body>

<h2>Food Menu</h2>

<table border="1">
    <tr>
    	<th>ID</th>
        <th>Name</th>
        <th>Category</th>
        <th>Price</th>
        <th>Image</th>
        <th>Action</th>
    </tr>

<%
    FoodDAO dao = new FoodDAO();
    List<Food> foodList = dao.getAllFood();

    for(Food food : foodList){
%>

<tr>
    <td><%= food.getId() %></td>
    <td><%= food.getName() %></td>
    <td><%= food.getCategory() %></td>
    <td>&#8377;<%= food.getPrice() %></td>

    <td>
        <img src="images/<%= food.getImage() %>"
             width="100"
             height="100">
    </td>

    <td>
        <a href="order.jsp?foodId=<%= food.getId() %>">
            Order Now
        </a>
    </td>
</tr>
<%
    }
%>

</table>

</body>
</html>