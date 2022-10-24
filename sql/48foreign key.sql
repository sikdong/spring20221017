DESC Student;
SELECT * FROM Student;
-- 학생의 연락처 저장
-- 연락처 table 따로 빼기
-- 연락처 
-- 컬럼 : 연락처, studentiD
CREATE TABLE Contact (
	studentID INT, 
    contact VARCHAR(255),
    PRIMARY KEY(studentID, contact)
);
DROP TABLE Contact;
-- FOREIGN KEY 제약 사항 추가
CREATE TABLE Contact(
	id INT PRIMARY KEY AUTO_INCREMENT,
    studentId INT,
    FOREIGN KEY (studentId) REFERENCES Student(id)
);

-- 외래키가 존재하는 경우
-- 부모테이블의 레코드가 삭제될 경우
DELETE FROM Student WHERE id = 4; -- 먼저 삭제될 수 없음
-- -> 자식 테이블 레코드 삭제를 먼저 해야함
DELETE FROM Contact
WHERE StudentId= 4;

