CREATE DATABASE logu;
show databases;
use logu;
create table Student(studentID int,name varchar(55),rollno int,address varchar(150),phoneno int);
show tables;
desc Student;
insert into Student values(001,"logu",111,"erode",9003733);
insert into Student values(002,"moni",112,"erode",900373);
select*from Student;
create table Student1(studid int,name varchar(99),rollno int,address varchar(90));
insert into Student1 values(003,"logi",113,"erode");
select*from Student1;
truncate table Student1;
select*from Student1;
alter table Student add register varchar(90);
desc Student;
alter table Student drop column phoneno;
desc Student;

