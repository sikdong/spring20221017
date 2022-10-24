USE w3schools;

-- MIN : 가장 작은 값

SELECT * FROM Customers ORDER BY Price;
SELECT MIN(Price) FROM Products;
-- MAX : 가장 큰 값
SELECT MAX(Price) FROM Products;

-- 직원 생일 중 가장 먼저 태어난 사람의 생일

SELECT MIN(BirthDate) FROM Employees;
SELECT MAX(BirthDate) FROM Employees;

SELECT COUNT(*) FROM Customers;
SELECT COUNT(CustomerName) FROM Customers;
-- COUNT 함수는 NULL은 생략;
INSERT INTO Customers (ContactName, City, Country)
VALUES ('captain', 'ny', 'USA');


-- 100.00 달러가 넘는 상품의 수
SELECT COUNT(*) FROM Products WHERE Price > 100.00;
SELECT * FROM Products WHERE Price > 100.00;
SELECT * FROM Products;


SELECT COUNT(*) FROM Employees WHERE BirthDate BETWEEN '1960-01-01' AND '1969-12-31';

-- AVG : 평균 // NULL 데이터 무시
SELECT AVG(Price) FROM Products;

SELECT * FROM OrderDetails;

SELECT AVG(Quantity) FROM OrderDetails;

-- IFNULL : 값이 없으면 (NULL) 다른 값으로 바꿔서 조회
SELECT * FROM Products; 

INSERT INTO Products(ProductName) VALUES("Kimchi");
-- Customers 테이블에 CustomerName 이 Null 이면 -> 'Anonymous'
SELECT ifnull(CustomerName, 'Anonymous'), CustomerID FROM Customers;
INSERT INTO Customers(CustomerID) VALUES (100);