-- like : 패턴으로 레코드 조회
-- 패턴에서 사용하는 특수기호(wildcard) : % (0개 이상의 문자), _(하나의 문자)
SELECT * FROM Customers WHERE CustomerName LIKE 'A%'; -- 대소문자 구별 없음

SELECT * FROM Employees WHERE FirstName LIKE 'A%';
SELECT * FROM Suppliers WHERE ContactName LIKE '%E';
SELECT * FROM Products WHERE ProductName LIKE 'C%S';
SELECT * FROM Products WHERE ProductName LIKE 'C____';
