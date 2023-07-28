<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
<link href="CSS/demo.css" rel="StyleSheet" />
</head>
<body>
<img src="Images/Img1.jpg" width="100%"  height="250px" />

<form name="f1"  method="POST"  action="loginprocess">
<p style="text-align: center;width:100%">
	<input type="text"  name="txtUser" class="textbox" placeholder="Username" />
	<br /><br />
	<input type="password" name="txtPwd" class="textbox" placeholder="Password" />
	<br /><br />
	<input type="submit"  value="Click Me" class="buttoncss" />
</p>
</form>
<h1 style="text-align: center;width:100%">${msg }</h1>
</body>
</html>