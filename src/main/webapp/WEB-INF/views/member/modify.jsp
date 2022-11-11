<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<my:navbar></my:navbar>
<h3>회원 정보 수정</h3>
<h6>회원 정보 수정을 원하시면 아래 빈칸을 수정하세요</h6>
<form id="updateMemberForm" action="" method="post">
	아이디 : <input type="text" value="${memberList.id }" readonly>
	<br>
	비밀번호 : <input type="text" value="${memberList.password }" name="password">
	<br>
	이메일 : <input type="text" value="${memberList.email }" name="email"> 
	<br>
</form>
	<input data-bs-toggle="modal" data-bs-target="#updateMemberModalLabel" type="submit" value="수정">

	<div class="modal fade" id="updateMemberModalLabel" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="updateMemberModalLabel">회원 정보 수정 확인</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">회원 정보를 수정하시겠습니까?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">취소</button>
					<button id="modifyConfirmButton" type="button"
						class="btn btn-primary">확인</button>
				</div>
			</div>
		</div>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
document.querySelector("#modifyConfirmButton").addEventListener("click", function(){
	document.querySelector("#updateMemberForm").submit();
})

</script>
</body>
</html>