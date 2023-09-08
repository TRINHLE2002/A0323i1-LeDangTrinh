create database student_management;
use student_management;
create table HocSinh(
StudentId int,
StudentName varchar(255),
StudentAge int,
Country varchar(255)
);
create table LopHoc(
Id int,
ClassName varchar(255)
);
create table Teacher(
Id int,
TeacherName varchar(255),
TeacherAge int,
Country varchar(255)
);