<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<title>Place Order</title>
</head>
<body>

<h2>Place Order</h2>

<form action="<%=request.getContextPath()%>/PlaceOrderServlet" method="post">

    <input type="hidden"
           name="foodId"
           value="<%= request.getParameter("foodId") %>">

    Food ID:
    <%= request.getParameter("foodId") %>

    <br><br>

    Quantity:
    <input type="number"
           name="quantity"
           min="1"
           required>

    <br><br>

    <input type="submit"
           value="Place Order">

</form>

</body>
</html>