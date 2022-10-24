CREATE DATABASE mydb2;
USE mydb2;
CREATE TABLE Products AS
SELECT * FROM w3schools.Products;
CREATE TABLE Categories AS
SELECT * FROM w3schools.Categories;

DESC Products;
DESC Categories;
ALTER TABLE Products
ADD PRIMARY KEY (ProductID);
ALTER TABLE Categories
ADD PRIMARY KEY (CategoryID);

ALTER TABLE Products
ADD FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID);