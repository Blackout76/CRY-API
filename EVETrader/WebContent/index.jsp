<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/evetrade.css" type="text/css" />
<title>Price estimate</title>
</head>
<body>
<div align="center">
<h1>Price estimate in Jita IV - Moon 4 - Caldari Navy Assembly Plant</h1>
<hr>
<h2>(max(buy order)+min(sell order))/2</h2>
<hr>
<form id=fr_add name=fr_add method=get action="evePrice">
<label for="Items">Items : </label>
<textarea name="items" id="items" rows="20" cols="100"></textarea>
<br>
<br>
<input type=submit name=sb value="Estimate">
</div>
</form>
</body>
</html>