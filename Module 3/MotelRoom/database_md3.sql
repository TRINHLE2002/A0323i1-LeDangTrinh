	create database room_management;
use room_management;

create table motel_room(
id int auto_increment primary key,
`name` varchar(45),
phone_number varchar(45),
start_day date,
id_pay int,
note varchar(45),
foreign key (id_pay) references payment_method(id_pay)
);

create table payment_method(
id_pay int auto_increment primary key,
name_pay varchar(45)
); 

insert into motel_room(name,phone_number,start_day,id_pay,note) values (?,?,?,?,?);
select * from motel_room;
select * from payment_method where id_pay = 2;
delete from motel_room where id = 4;

delimiter //
create procedure find_by_name(search_name varchar(50))
begin
select *
from motel_room
where name = search_name;
end //
delimiter ;

call find_by_name("23");