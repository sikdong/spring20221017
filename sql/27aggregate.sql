-- aggregate function : 집함 함수, 그룹 함수
SELECT * FROM Products;
SELECT * FROM Products ORDER BY CategoryID, Price DESC;
SELECT MAX(Price), CategoryID FROM Products GROUP BY CategoryID;

-- CategoryID 별 가장 작은 값
SELECT MIN(Price), CategoryID FROM Products GROUP BY CategoryID;
-- CategoryID 별 평균 갸격
SELECT AVG(Price), CategoryID FROM Products GROUP BY CategoryID;
-- CategoryID 별 가격 합
SELECT SUM(Price), CategoryID FROM Products GROUP BY CategoryID;

-- 나라별 고객 수
SELECT COUNT(*), COUNTRY FROM Customers GROUP BY COUNTRY;

SELECT COUNT(*), city FROM Suppliers GROUP BY city;

-- 상품 테이블에서 카테고리별 평균
-- 카테고리별 평균이 30.00 보다 큰 것만 조회
SELECT CategoryID, AVG(Price) FROM Products GROUP BY CategoryID HAVING AVG(Price) > 30.00; 

