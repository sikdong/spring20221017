-- MODIFY COLUMN : 컬럼 수정
DESC MyTable17;
ALTER TABLE MyTable17
MODIFY COLUMN col1 INT NOT NULL;
SELECT * FROM MyTable17;
INSERT INTO MyTable17(col1,col3, col4)
VALUES (3,3,3);
ALTER TABLE MyTable17
MODIFY COLUMN col2 INT NOT NULL;
ALTER TABLE MyTable17
MODIFY COLUMN col3 VARCHAR(255) UNIQUE;