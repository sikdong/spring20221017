<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<form action="" method="get">
		<input type="text" name="name" value="${supplier.name }">
		<input type="submit" value="조회">
	</form>
	
	<h1>공급자 정보 입력하기</h1>
	<form action="" method="post">
	<input type="text" name="id" value="${supplier.id }">
	<br>
	<input type="text" name="name" value="${supplier.name }">
	<br>
	<input type="text" name="contactName" value="${supplier.contactName}">
	<br>
	<input type="text" name ="address" value="${supplier.address }">
	<br>
	<input type="text" name="city" value="${supplier.city }">
	<br>
	<input type="text" name="postalcode" value=${supplier.country }>
	<br>
	<input type="text" name="phone" value="${supplier.phone }">
	<input type="submit" value="수정">

	
	</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>