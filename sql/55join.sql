SELECT Count(*)
FROM Customers c Join Orders o JOIN Employees e;

-- '1996-07-04'에 주문을 처리한 직원 이름과 배송자명 조회
SELECT e.FirstName, e.LastName, s.ShipperName FROM Employees e join Orders o on o.EmployeeID = e. EmployeeID
															   JOIN Shippers s on s.ShipperID = o.ShipperID
                                                               WHERE OrderDate = '1996-07-04'; 