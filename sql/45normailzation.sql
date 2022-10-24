-- 한 컬럼이 다른 컬럼에 종속되어 있을 때 테이블을 만들어라
USE w3schools;
SELECT * FROM Products;
-- 상품명, 유닛, 가격, 카테고리명, 카테고리설명

CREATE TABLE MyProducts (
	productName VARCHAR(255),
    unit VARCHAR(255),
    price DEC(10,2),
    categoryName VARCHAR(255),
    description VARCHAR(255)
);

