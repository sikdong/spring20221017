-- Limit : 조회 결과 row 수를 제한
SELECT * FROM Customers LIMIT 5;

SELECT * FROM Products ORDER BY Price DESC LIMIT 3;

-- 가장 나이가 많은 직원 조회
SELECT * FROM Employees order by BirthDate limit 2;
SELECT * FROM Employees order by BirthDate desc limit 2;

SELECT * FROM Customers order by CustomerID LIMIT 1,3;

-- 직원의 나이가 두번째, 세번째 많은 사람 조회
SELECT * FROM Employees order by BirthDate limit 1,2;
SELECT * FROM Employees ORDER BY BirthDate desc limit 1,1;
select * from Products order by price desc limit 1,1;
select * from Products order by price desc limit 9,1; 

SELECT * FROM Customers order by CustomerID LIMIT 0, 10;