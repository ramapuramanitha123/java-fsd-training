create database anitha1db;
use anitha1db;
create table product(pid int,pname varchar(120),quantity int);

drop table product;
rename table product to product_info;
insert into product(pid,pname,quantity) values(101,'pen',1),(102,'book',2),(103,'pencil',3);
select * from employee;
truncate table product;
update product set pname=chair where pid  = 101;
delete from product_info;
select * from product  where pid=103;
alter table product add column price int;