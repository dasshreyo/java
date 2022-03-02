use org;
create table Employee(EMPLOYEE_ID   int primary key, FIRST_NAME varchar(20), LAST_NAME varchar(20), SALARY varchar(30), JOINING_DATE datetime, DEPARTMENT varchar(20));
create table title(EMPLOYEE_REF_ID int , EMPLOYEE_TITLE  varchar(20), AFFECTED_FROM datetime);
create table Bonus(EMPLOYEE_REF_ID int, BONUS_DATE datetime, BONUS_AMOUNT varchar(30));
insert into Employee values(002, 'Niharika', 'Verma', 80000, '11-06-14 09.00.00', 'Admin');
insert into Employee values(003,' Vishal',' Singhal', 300000 ,'14-02-20 09.00.00',' HR');
insert into Employee values
		(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
select * from Employee;
select * from Bonus;
select * from title;
insert into Bonus values
(3,'2016-02-20 00:00:00',' 4000'),
(1,' 2016-02-20 00:00:00',' 4500'),
(2,' 2016-06-11 00:00:00', '3500');
insert into  title values(3	                  ,'Lead',	     '2016-06-11 00:00:00');
select FIRST_NAME  as Employee from Employee;
select  FIRST_NAME from Employee where FIRST_NAME like'a%' ;
select FIRST_NAME from Employee order by FIRST_NAME ;
select * from Employee order by FIRST_NAME asc , DEPARTMENT desc;
select * from Employee where DEPARTMENT ='Admin';
select * from Employee where  salary Between   100000 And  500000;

select * from Employee where FIRST_NAME like '%a';
select * from Employee where FIRST_NAME like '%h';
select * from Employee where year(JOINING_DATE)=2014 AND month(JOINING_DATE)=2 ;
select count(DEPARTMENT) from employee where DEPARTMENT ='Admin';
select count(DEPARTMENT) from employee where DEPARTMENT IN('Admin');
select FIRST_NAME,LAST_NAME ,salary from Employee where salary between 50000 and 100000;
Select * from Employee where EMPLOYEE_id % 2 = 0;
select * from Employee where FIRST_NAME in('vipul','satish');
select * from Employee where  FIRST_NAME not in('vipul','satish');
select now();