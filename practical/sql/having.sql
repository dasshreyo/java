use riya;
select * from student;
select count(id) as 'total_count',address from student group by address having count(id) >1;