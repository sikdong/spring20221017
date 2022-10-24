USE mydb2;
-- 학생 table
CREATE TABLE Student(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    age INT,
    gender VARCHAR(1)
);

INSERT INTO Student (id, name, age, gender)
VALUES(1, 'KIM', 30, 'F');

INSERT INTO Student (id, name, age, gender)
VALUES(2, 'KIM', 40, 'M');

INSERT INTO Student (name, age, gender)
VALUES('CHOI', 20, 'F');

SELECT * From Student;

DELETE FROM Student WHERE id=2;
DELETE FROM Student WHERE id=3;



