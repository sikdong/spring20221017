-- 서브 쿼리 : 쿼리가 다른 쿼리안에 작성될 수 있다
SELECT * FROM Products
WHERE Price = 
(SELECT MAX(Price) FROM Products);

SELECT * FROM Products
WHERE Price > (SELECT avg(price) FROM Products); 

