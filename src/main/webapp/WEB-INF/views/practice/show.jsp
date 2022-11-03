<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="my"  tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>

<h2>(${customerList.id } 번 고객 세부사항 정보)</h2> <br />
<h3>이름 : ${customerList.name }</h3> <br />
<h3>별칭 : ${customerList.contactName }</h3> <br />
<h3>주소 : ${customerList.address }</h3> <br />
<h3>도시 : ${customerList.city }</h3> <br />
<h3>우편 : ${customerList.postalCode }</h3> <br />
<h3>나라 : ${customerList.country }</h3> <br />

<a class="btn btn-primary" href="">수정</a>
<c:url value="/practice/delete" var="deleteLink">
</c:url>
<form action="${deleteLink }" method="post">
	<input type="hidden" name="id" value="${customerList.id }" />
	<input type="submit" value="삭제">
</form>

</body>
</html>