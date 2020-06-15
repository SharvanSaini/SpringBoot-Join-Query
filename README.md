# SpringBoot-Join-Query

Oracle Join query perform

you can perform any database join query, you can change only application.properties database credientials.

directly insert the data in Oracle, tables(student and department) are automatically created

select * from department;
select * from student;

insert into student values(1001,25,1,'a@gmail.com','a');

insert into student values(1002,23,2,'b@gmail.com','b');

insert into student values(1003,21,1,'c@gmail.com','c');
  
insert into department values(1,'CSE');

insert into department values(2,'ME');

Test Perform in postman

Get method for join query- localhost:8902/api/joinQuery
 
