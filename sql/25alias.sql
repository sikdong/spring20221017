-- ALIAS : 컬럼/테이블에 별칭을 줄 수 있다.
-- AS

SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID AS id, 
	   CustomerName AS name
FROM Customers;
SELECT * FROM Customers;

SELECT CustomerID AS id, IFNULL(CustomerName, 'Anonymous') AS name
FROM Customers;

SELECT EmployeeID AS id, 
	   FirstName AS fname,
       LastName AS lname,
       BirthDate AS birth
FROM Employees;

SELECT ifnull(Price, 0.00) Price FROM Products;       