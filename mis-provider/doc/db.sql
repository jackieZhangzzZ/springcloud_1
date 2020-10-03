show databases;

create database testmis;


use testmis;

drop table book;

create table book(
   book_id int primary key auto_increment,
   book_name varchar(50),
   book_author varchar(50),
   book_price double,
   book_date date,
   user_id int
);

select * from book;

insert into book(book_name,book_author,book_price,book_date,user_id) values('a','张三',20.3,now(),1  );