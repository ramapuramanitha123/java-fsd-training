create database  employeedata;
use employeedata ;
create table user905(id int not null auto_increment,name varchar(40)not null,password varchar(30),email varchar(60),country varchar(20) ,primary key (id));
insert into user905 (id,name,password,email,country) values (id,'anitha','anitha123','anitha.ramapuram@gmail.com','india'),
(id ,'uma','uma1234','uma.paluru@gmail.com','U.K'),
(id,'sravani','sravani123','sravani.rajaneni@gmail.com','china');

Select * from user905;
drop table user905;
