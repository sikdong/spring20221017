-- CONCAT : 스트링을 연결한 결과를 리턴
SELECT CONCAT('ab', 'de');
SELECT CONCAT('def',' ', 'xyz',' captain');

SELECT * FROM Customers;

SELECT CustomerID,
	   CustomerName,
       concat(Address, " ", city) Address
FROM Customers;

-- 직원 테이블에서 firstName, lastName 연결 해서 fullname으로 조회
SELECT CONCAT(firstName, " ", lastName) fullname FROM Employees;       