DROP TABLE Bank;
CREATE TABLE Bank (
	customerId INT PRIMARY KEY,
	balance INT
);

INSERT INTO Bank(customerId, balance)
VALUES(1, 10000);

INSERT INTO Bank(customerId, balance)
VALUES(2, 50000);
UPDATE Bank
SET balance = balance - 5000
WHERE customerId = 1;

UPDATE Bank
SET balance = balance + 5000
WHERE customerId = 2;

SELECT * FROM Bank;


-- transaction : 하나의 업무(여러 update, delete, insert, select 쿼리의 묶음)

-- commit : 진행된 내용을 DB에 반영함
-- ROLLBACK : 진행되고 있던 내용을 모두 원복함

-- autocommit 여부 확인
SHOW VARIABLES WHERE Variable_name = 'autocommit';

-- autocommit --> disable
SET autocommit = 0;

-- autocommit => enabled
SET autocommit = 1;

-- 송금 업무
-- 2번 고객이 1번 고객에게 5000원 송금함
UPDATE Bank
SET balance = balance - 5000
WHERE customerId = 2;

ROLLBACK;

UPDATE Bank
SET balance = balance + 5000
WHERE customerId = 1;

COMMIT;