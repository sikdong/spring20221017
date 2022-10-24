-- 문자열
-- VARCHAR(size) : size까지의 문자열 저장 가능

CREATE TABLE myTable01(
col1 VARCHAR(5),
col2 varchar(2));

INSERT INTO myTable01(col1, col2)
VALUES ('abcde', 'ab');
INSERT INTO myTable01(col1, col2)
VALUES ('abc', 'a');
INSERT INTO myTable01(col1, col2)
VALUES ('abc', 'abc');
INSERT INTO myTable01(col1, col2)
VALUES ('abcde', 'c');
INSERT INTO myTable01(col1, col2)
VALUES ('abcdefe', 'ab');

CREATE TABLE myTable03 (
	col1 VARCHAR(3),
	col2 CHAR(3)
);
INSERT INTO myTable03(col1, col2)
VALUES ('ABC', 'ABC');
INSERT INTO myTable03(col1, col2)
VALUES('AB', 'AB');
