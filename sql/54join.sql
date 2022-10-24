USE w3schools;
SELECT * FROM Products;
SELECT p.ProductName, s.SupplierName FROM Products p JOIN Suppliers s
		ON p.SupplierID = s.SupplierID;
        
-- 'Tofu'를 공급하는 공급자명, 공급자가 사는 도시
SELECT s.SupplierName, s.City, ProductName FROM Products p Join Suppliers s
on p.SupplierID = s.SupplierID WHERE p.ProductName = 'Tofu';
SELECT * FROM Products WHERE ProductName = 'tofu';
SELECT * FROM Suppliers;
-- 'Mayumi''s'가 공급하는 상품명들 조회
SELECT p.ProductName, s.SupplierName FROM Suppliers s Join Products p
on p.SupplierID = s.SupplierID
WHERE s.SupplierName = 'Mayumi''s';
SELECT * FROM Orders WHERE OrderDate = '1996-07-04';
SELECT CustomerName, o.OrderDATE FROM Orders o JOIN Customers c
on c.CustomerID = o.CustomerID WHERE OrderDate = '1996-07-04';

SELECT FirstName, LastName, o.OrderDATE FROM Orders o JOIN Employees e
on e.EmployeeID = o.EmployeeID WHERE OrderDate = '1996-07-04';

SELECT s.ShipperName, o.OrderDate From Orders o Join Shippers s
on s.ShipperID = o.ShipperID WHERE OrderDate = '1996-07-04';