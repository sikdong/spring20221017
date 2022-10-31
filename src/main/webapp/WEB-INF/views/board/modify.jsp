<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
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

	<my:navbar></my:navbar>
	<div class="container-md">
		<div class="rol">
			<div class="col">
				<h1>${board.id }번 게시물 수정</h1>
			
			
				<form id="modifyForm" action="" method="post">
					<input type="hidden" value="${board.id }" name="id"> 
					
					<div class="mb-3">
					<label for="" class="form-label">
					제목 
					</label>
					<input type="text" name="title" value="${board.title }" class="form-control"> 
					</div>
					
					<div class="mb-3">
					<label for="" class="form-label">
					본문
					</label>
					<br>
					<textarea rows="5" name="content" class="form-control">${board.content }</textarea>
					</div>
					
					<div class="mb-3">
					 <label for="" class="form-label">
					 작성자 
					 </label>
					 <input class="form-control" type="text" name="writer"
						value="${board.writer }"> 
					</div>
					
					<div class="mb-3">
					<label for="" class="form-label">
						작성일시 
					</label>
					<input class="form-control" type="datetime-local" value="${board.inserted }"> <br>
					</div>
				</form>
				
				<input class="btn btn-primary" type="submit" value="수정" data-bs-toggle="modal"
					data-bs-target="#modifyModal">
				<input class="btn btn-danger" type="submit" value="삭제" data-bs-toggle="modal" data-bs-target="#deleteModal">
			
			<!--  삭제 폼 -->
				<c:url value="/board/remove" var="removeLink">
				</c:url>
				<form id="deleteForm" action="${removeLink }" method="post">
					<input type="hidden" name="id" value="${board.id }"> 
				</form>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="modifyModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">수정 확인</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">수정하시겠습니까?</div>
				<div class="modal-footer">
					<button id="modifyConfirmButton" type="button"
						class="btn btn-primary">확인</button>
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">취소</button>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Modal -->
	<div class="modal fade" id="deleteModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">삭제 확인</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">삭제하시겠습니까?</div>
				<div class="modal-footer">
					<button id="deleteConfirmButton" type="button"
						class="btn btn-danger">확인</button>
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">취소</button>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<script>
	// 수정확인 모달
		document.querySelector("#modifyConfirmButton").addEventListener(
				"click", function() {
					document.querySelector("#modifyForm").submit();
				});
	</script>
	
	<script>
		// 삭제 확인 모달
		document.querySelector("#deleteConfirmButton").addEventListener(
				"click", function() {
					document.querySelector("#deleteForm").submit();
				});
	</script>
	
</body>
</html>