<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
</head>
<body>

<h2>Customer Registration</h2>

<form action="${pageContext.request.contextPath}/RegisterServlet" method="post">

    Name:
    <input type="text" name="name"><br><br>

    Email:
    <input type="email"
       name="email"
       id="email"
       onkeyup="checkEmail()">

	<span id="msg"></span>
	<br><br>
	
    Password:
    <input type="password" name="password"><br><br>

    Phone:
    <input type="text" name="phone"><br><br>

    <input type="submit" value="Register">

</form>
<script>

function checkEmail() {

    var email =
        document.getElementById("email").value;

    var xhttp =
        new XMLHttpRequest();

    xhttp.onreadystatechange =
        function() {

        if(this.readyState == 4 &&
           this.status == 200) {

            document.getElementById("msg")
                .innerHTML =
                this.responseText;
        }
    };

    xhttp.open(
        "GET",
        "CheckEmailServlet?email=" + email,
        true
    );

    xhttp.send();
}

</script>
</body>
</html>