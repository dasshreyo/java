select * from student;
// like 's%' = start with s
// like '%s' = end with s
// like '%sa%' = anywhere present sa
// like '_s%' = in second position  s
select * from student where name like '_h%';
select * from student where name like '%a';