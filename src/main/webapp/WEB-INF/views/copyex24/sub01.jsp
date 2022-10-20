<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<div class="container">
		<div class="row">
			<div class="col">
				<h2 style="text-align: center">고객 목록</h2>
				<table class="table">
					<thead>
						<tr>
							<th>번호</th>
							<th>고객 이름</th>
							<th>도시</th>
							<th>주소</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${CustomerList}" var="customer">
							<tr>
								<th>${customer.id }</th>
								<td>${customer.name }</td>
								<td>${customer.city }</td>
								<td>${customer.address }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>


	<nav aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
			<c:forEach begin="${pageInfo.firstPage }" end="${pageInfo.lastPage }"
				var="pageNumber">
			<c:url value = "/copyex24/sub02" var="link">
				<c:param name="page" value="${pageNumber}"></c:param>
			</c:url>
				<li class="page-item"><a class="page-link" href="${link }">${pageNumber}</a></li>
			</c:forEach>
		</ul>
	</nav>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>