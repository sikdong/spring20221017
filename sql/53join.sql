CREATE DATABASE mydb5;
USE mydb5;
CREATE TABLE Categories
AS
SELECT CategoryId, CategoryName
FROM w3schools.Categories;

CREATE TABLE Products
AS
SELECT ProductID, ProductName, CategoryID
FROM w3schools.Products;

USE w3schools;
SELECT * FROM w3schools.Products;
SELECT * FROM Categories;
SELECT * FROM Products WHERE ProductName = 'Chais';
SELECT * FROM Categories WHERE CategoryId = '1';

-- JOIN : 두개 이상의 테이블을 연결해서 조회할 수 있다.
-- CARTESIAN PRODUCT
SELECT * FROM Products JOIN Categories
WHERE Products.CategoryID = Categories.CategoryID
AND Products.ProductName = 'chais';
DROP DATABASE w3schools;
SELECT * FROM Categories;
DROP DATABASE mydb5;
SELECT * FROM Categories JOIN Products
WHERE Products.ProductName = 'Ikura';
SELECT * FROM Products Join Categories ON Categories.CategoryID = Products.CategoryID
WHERE Categories.CategoryName = 'Seafood';

SELECT c.CategoryId, p.ProductName
FROM Categories AS c JOIN Products as p
on p.CategoryId = p.CategoryId
WHERE c.CategoryName = 'SeaFood';