<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><font color='green'>${msg}</font></p>
<h1>Products Listing</h1>
<form:form action="save" modelAttribute="product" method = "POST" >
	<table>
	
	<tr>
	<td>Name :</td>
	<td> <form:input path="name" /> </td>
	</tr>
	<tr>
	<td>Price :</td>
	<td> <form:input path="price" /> </td>
	</tr>
	
	<tr>
	<td>Quantity :</td>
	<td> <form:input path="quantity" /> </td>
	</tr>
	
	<tr>
	<td> <input type="submit" value="Add Product" /> </td>
	</tr>
	</table>
 </form:form>
<a href="products">View Products</a>

</body>
</html>