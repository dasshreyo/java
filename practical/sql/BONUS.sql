USE ORG;
CREATE TABLE BONUS(WORKER_REFID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,BONUS_DATE DATETIME,BONUS_AMOUNT
INT(15));
INSERT INTO BONUS VALUES(1, '2016-02-20 00:00:00',4000);
INSERT INTO BONUS VALUES(2, ' 2016-06-11 00:00:00',3000);
INSERT INTO BONUS VALUES(3, '2016-02-20 00:00:00',4500);
INSERT INTO BONUS VALUES(4, '2016-02-20 00:00:00',2000);
INSERT INTO BONUS VALUES(2, '2016-06-11 00:00:00',3500);
SELECT * FROM BONUS;
