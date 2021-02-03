<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB APP</title>
</head>
<body>
	<h1 align="center">${headers}</h1>
	<hr>
	<form action="processOrder">
		<div align="center">
			<label for="item">Item Name :</label> <input type="text" id="item"
				placeholder="Enter here.." name="food"> <input type="submit"
				value="Order">
		</div>
	</form>
</body>
</html>