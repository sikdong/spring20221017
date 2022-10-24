-- NOT NULL : 널이면 안됨
CREATE TABLE MyTable10(
	col1 VARCHAR(255),
    col2 VARCHAR(255) NOT NULL
    
);

DESC MyTable10;

INSERT INTO MyTable10(col1,col2)
VALUES('A','B');
INSERT INTO MyTable10(col2)
VALUES('C');

CREATE TABLE MyTable11(
	col1 INT,
    col2 INT NOT NULL
);

INSERT INTO MyTable11(col1, col2)
VALUES(3,4);

   
