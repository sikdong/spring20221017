USE mydb6;
SELECT * FROM TableA
UNION -- 합집합 같은 개념(중복은 X)
SELECT * FROM TableB;


