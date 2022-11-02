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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
body {
background-color : ivory;
}
h2 {
	text-align : center;
}
</style>

</head>
<body>

<h2>고객 명단</h2>
<c:url value="/practice/register" var="registerPage">
</c:url>
<ul class="nav">

  <!-- 신규 등록 버튼 -->
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="${registerPage }">신규 등록</a>
  </li>
  
  <!-- 고객 삭제 버튼 -->
  <li class="nav-item">
    <a class="nav-link" href="#">고객 삭제</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link" href="#">#</a>
  </li>
</ul>
<table class="table">
	<thead>
		<tr>
			<th>번호</th>
			<th>고객 이름</th>
			<th>주소</th>
			<th>도시</th>
			<th>국가</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${showList }" var="customer">
		<tr>
			<td>${customer.id }</td>
			
			 <c:url value="/practice/show" var="showPage">
			 	<c:param name="id" value="${customer.id }"></c:param>
			 </c:url>
			 
			<td>
			 <a href="${showPage}">
			${customer.name }
			 </a>
			</td>
			
			
			<td>${customer.address }</td>
			<td>${customer.city }</td>
			<td>${customer.country }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</nav>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>