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
	
<h3>회원 정보</h3>	
아이디: ${memberList.id }
<br>
비밀번호: ${memberList.password }
<br>
이메일: ${memberList.email }
<br>
가입일시 : ${memberList.inserted }
<br>
<br>
<c:url value="/member/modify" var="updateMemberLink">
	<c:param name="id" value="${memberList.id }"></c:param>
</c:url>
<a href="${updateMemberLink }" class="btn btn-info">회원 정보 수정</a>
<c:url value="/member/remove" var="deleteMemberLink">
	<c:param name="id" value="${memberList.id }"></c:param>
</c:url>
<c:url value="/member/remove" var="removeUrl" />
	<form action="${removeUrl }" method="post" id="deleteMemberInfoForm" >
		<input type="hidden" name="id" value="${memberList.id }">
	</form>
		<input type="submit" value="탈퇴" data-bs-toggle="modal" data-bs-target="#deleteInfoConfirmModal">
	

<!--회원 정보 삭제 확인 Modal -->
<div class="modal fade" id="deleteInfoConfirmModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" >회원 탈퇴 확인 </h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        회원을 탈퇴하시겠습니까?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary btn-sm" data-bs-dismiss="modal">취소</button>
        <button type="button" class="btn btn-warning btn-sm" id="deleteMemberButton">확인</button>
      </div>
    </div>
  </div>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
document.querySelector("#deleteMemberButton")
	.addEventListener("click", function(){
	document.querySelector("#deleteMemberInfoForm").submit();
})
</script>
</body>
</html>