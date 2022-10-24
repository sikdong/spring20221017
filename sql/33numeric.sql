-- DATA TYPE
-- Numeric
-- INT : 정수
-- DEC : 소수점 있는 형식
DROP TABLE myTable03;
CREATE TABLE myTable03 (
	col1 INT(3),
    col2 INT(4),
    col3 INT
);

INSERT INTO myTable03 (col1, col2, col3)
Values (999, 9999, 2100000000);
INSERT INTO myTable03 (col1, col2, col3)
VALUES(9999,9999,2100000000);

CREATE TABLE myTable04(
	col1 INT(6),
    col2 INT(2)
);

INSERT INTO myTable04(col1, col2)
VALUES(9,999);
SELECT * FROM myTable04;

-- DEC : 소수점 있는 형식 수 저장
CREATE TABLE myTable05(
	col1 DEC(3, 1), -- 총 길이 3, 소수점 아래1
    col2 DEC(5,2) -- 총길이 5, 소수점 아래2
);

INSERT INTO myTable05(col1, col2)
VALUES(10.5, 200.01);
INSERT INTO myTable05(col1, col2)
VALUES(10.55, 200.01);
SELECT * FROM myTable05;

-- INT -> java int, long
-- DEC -> java double, BigDecimal

