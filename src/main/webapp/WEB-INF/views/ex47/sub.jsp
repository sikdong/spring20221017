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
</head>
<body>
	<h3>json 응답 처리</h3>
	<div id="message"></div>
	<button id="btn1">버튼 1번</button><br>
	<button id="btn2">버튼 2번</button><br>
	<button id="btn3">/sub03 버튼 3번</button><br>
	<button id="btn4">/sub04 버튼 4번</button>
	<button id="btn5">/sub04 버튼 5번</button>
	<br>
	<input type="number" placeholder="고객번호" id="customerIdInput1" value="1">
	<br>
	<button id="btn6"></button>
	<br>
	<input type="text" placeholder="공급자 이름" id="supplierInput1" value="Exotic Liquid">
	<br>
	<button id="btn7">공급자 정보 조회</button>
	<br>
	<input type="number" placeholder="고객번호" id="customerIdInput8" value="1">
	<br>
	<button id="btn8">/ex47/sub08/customerId, customer json 응답 </button>
	<div id="customerInfoDiv">
		id : <span class="id"></span> <br>
		name : <span class="name"></span> <br>
		city : <span class="city"></span> <br>
		country : <span class="country"></span>
	</div>
	<div id="messageDiv"></div>
	
	<input type="text" placeholder="공급자 이름" id="supplierIdInput9" value="Exotic Liquid">
	<br>
	<button id="btn9">/ex47/sub09/supplierId, supplier json 응답 </button>
	<div id="supplierInfoDiv">
		id : <span class="id"></span> <br>
		name : <span class="name"></span> <br>
		city : <span class="city"></span> <br>
		country : <span class="country"></span>
	</div>
	
	<button id="btn11">/ex47/sub11 put 요청 : 공급자정보 update</button>
	<input type="text" id="supplierIdInput11" placeholder="아이디"> <br>
	<input type="text" id="supplierNameInput11" placeholder="이름"> <br>
	<input type="text" id="supplierContactNameInput11" placeholder="계약명"> <br>
	<input type="text" id="supplierAddressInput11" placeholder="주소"> <br>
	<input type="text" id="supplierCityInput11" placeholder="도시"> <br>
	<input type="text" id="supplierPostalCodeInput11" placeholder="우편번호"> <br>
	<input type="text" id="supplierCountryInput11" placeholder="국가"> <br>
	<input type="text" id="supplierPhoneInput11" placeholder="전화번호"> <br>
	<button id="btn13">/ex47/sub13 post 요청 : 공급자 정보 insert</button>
	
	<button id="btn14">/ex47/sub11 delete 요청 : 공급자정보 삭제</button>
	<br>
	<input type="text" id="supplierIdInput" placeholder="아이디"> <br>
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";
document.querySelector("#btn14").addEventListener("click", function() {
	const id = document.querySelector("#supplierIdInput").value;
	fetch(ctx+"/ex47/sub14/"+id, {
		method: "delete"
	})
	.then(res => res.json())
	.then(data =>{
		document.querySelector("#message").innerText = data.message;
	})
})


document.querySelector("#btn13").addEventListener("click", function() {
	const name = document.querySelector("#supplierNameInput11").value;
	const contactName = document.querySelector("#supplierContactNameInput11").value;
	const address = document.querySelector("#supplierAddressInput11").value;
	const postalCode = document.querySelector("#supplierPostalCodeInput11").value;
	const country = document.querySelector("#supplierCountryInput11").value;
	const phone = document.querySelector("#supplierPhoneInput11").value;
	const city = document.querySelector("#supplierCityInput11").value;
	const data = {name, contactName, address, postalCode, country, phone, city};
	fetch(ctx+"/ex47/sub13", {
		method: "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : JSON.stringify(data)
	})
	.then(res => res.json())
	.then(data =>{
		document.querySelector("#message").innerText = data.message;
	})

})


document.querySelector("#btn11").addEventListener("click", function() {
	const name = document.querySelector("#supplierNameInput11").value;
	const contactName = document.querySelector("#supplierContactNameInput11").value;
	const address = document.querySelector("#supplierAddressInput11").value;
	const postalCode = document.querySelector("#supplierPostalCodeInput11").value;
	const country = document.querySelector("#supplierCountryInput11").value;
	const phone = document.querySelector("#supplierPhoneInput11").value;
	const city = document.querySelector("#supplierCityInput11").value;
	const data = {name, contactName, address, postalCode, country, phone, city};
	
	fetch(ctx +"/ex47/sub11", {
		method : "put",
		headers : {
			"Content-Type" : "application/json"
		},
		body : JSON.stringify(data)
	})
	.then(res => res.json())
	.then(data => {
		document.querySelector("#messageDiv").innerText=data.message;
	})
})


document.querySelector("#btn9").addEventListener("click", function() {
	document.querySelector("#supplierInfoDiv .id").innerText = "";
	document.querySelector("#supplierInfoDiv .name").innerText = "";
	document.querySelector("#supplierInfoDiv .city").innerText = "";
	document.querySelector("#supplierInfoDiv .country").innerText = ""; 
	
	const name=document.querySelector("#supplierIdInput9").value;
	fetch(ctx+"/ex47/sub09/" + name)
	.then(res => res.json())
	.then(data => {
		document.querySelector("#supplierInfoDiv .id").innerText = data.supplier.id;
		document.querySelector("#supplierInfoDiv .name").innerText = data.supplier.name;
		document.querySelector("#supplierInfoDiv .city").innerText = data.supplier.city;
		document.querySelector("#supplierInfoDiv .country").innerText = data.supplier.country; 
		
	})
})


document.querySelector("#btn8").addEventListener("click", function() {
	// 텍스트 초기화
	document.querySelector("#messageDiv").innerText = "";
	document.querySelector("#customerInfoDiv .id").innerText = "";
	document.querySelector("#customerInfoDiv .name").innerText = "";
	document.querySelector("#customerInfoDiv .city").innerText = "";
	document.querySelector("#customerInfoDiv .country").innerText = ""; 
	
	const customerId = document.querySelector("#customerIdInput8").value;
	fetch(ctx + "/ex47/sub08/" + customerId)
	.then(res => res.json())
	.then(data => {
		// html에 출력
		document.querySelector("#messageDiv").innerText = data.message;
		document.querySelector("#customerInfoDiv .id").innerText = data.customer.id;
		document.querySelector("#customerInfoDiv .name").innerText = data.customer.name;
		document.querySelector("#customerInfoDiv .city").innerText = data.customer.city;
		document.querySelector("#customerInfoDiv .country").innerText = data.customer.country;
	});
});



document.querySelector("#btn7").addEventListener("click", function(){
	const name = document.querySelector("#supplierInput1").value;
	fetch(ctx+"/ex47/sub07/"+name)
	.then(res => res.json())
	.then(data => {
		console.log(data.id)
		console.log(data.contactName)	
	})
})

document.querySelector("#btn1").addEventListener("click", function(){
	fetch(ctx+"/ex47/sub01")
	.then(res => res.json())
	.then(data => console.log(data))
})

document.querySelector("#btn2").addEventListener("click", function(){
	fetch(ctx+"/ex47/sub01")
	.then(res => res.json())
	.then(data => {
		console.log(data.name)
		console.log(data.address)
		console.log(data.job);
	})
	// data는 자바스크립트 객체 res.json()은 자바 스크칩트 객체이기 때문
})

document.querySelector("#btn3").addEventListener("click", function(){
	fetch(ctx+"/ex47/sub03")
	.then(res => res.json())
	.then(data => {
		console.log(data.color[0]);
		console.log(data.color[1]);
		console.log(data.model);
		console.log(data.location)
			
	})
})

document.querySelector("#btn4").addEventListener("click", function(){
	fetch(ctx+"/ex47/sub04")
	.then(res => res.json())
	.then(data => {
		console.log("id", data.id);
		console.log(data.name);
	})
})


document.querySelector("#btn5").addEventListener("click", function(){
	fetch(ctx+"/ex47/sub05")
	.then(res => res.json())
	.then(data => {
		console.log("id", data.contactName);
		console.log(data.city);
	})
})
</script>

</body>
</html>