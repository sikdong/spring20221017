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
	<form action="${pageContext.request.contextPath }/ex13/sub01">
		이름 : <input type="text" name="name"> <br>
		주소 : <input type="text" name ="address"> <br>
		이메일 : <input type="text" name="email"> <br>
		<input type="submit" value="전송">
	</form>
	
	<hr>
	
	<form action="${pageContext.request.contextPath }/ex13/sub02">
		이름 : <input type="text" name="name"> <br>
		나이 : <input type="number" name="age"> <br>
		암호 : <input type="password" name="password" id=""> <br>
		이메일 : <input type="text" name ="email"><br>
		<button>전송</button>
	</form>
	
	<form action="${pageContext.request.contextPath }/ex13/sub03">
		<input type="number" name="score">
		<input type="text" name = "className">
		<input type="text" name = "studentNumber">
		<input type="text" name = "location">
		<input type="number" name = "avg">
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>