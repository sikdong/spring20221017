SELECT * FROM Orders WHERE OrderDate = '1996-07-04';

SELECT * 
From OrderDetails
WHERE OrderID = 10248;

-- 1996-07-04에 주문된 상품명들 조회
SELECT * FROM OrderDetails;
SELECT * FROM Products;
SELECT * FROM Orders;
SELECT ProductName, OrderDate FROM OrderDetails od Join Products p on p.ProductID = od.ProductID
											  Join Orders o on o.OrderID = od.OrderID
                                              WHERE o.OrderDate = '1996-07-04';
                                              
-- 고객별 주문 총 금액 조회
SELECT c.CustomerName, Sum(od.Quantity * p.Price) 
FROM Customers c 
Join Orders o ON c.CustomerID = o.CustomerID
JOIN OrderDetails od on o.OrderID = od.OrderID
join Products p on od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY c.CustomerID;
