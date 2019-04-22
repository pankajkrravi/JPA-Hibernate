create table persion
(
id  integer not null,
name varchar(250) not null,
location varchar(250),
birth_date timestamp,
primary key(id)
);
insert into persion values(1001,'pankaj kumar','Bangalore',sysdate());
insert into persion values(1002,'jatan veer','BTM',sysdate());
insert into persion values(1003,'Anushree dey','Rajaginagar',sysdate());
