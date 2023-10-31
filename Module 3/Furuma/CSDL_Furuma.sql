CREATE DATABASE case_study_2;
USE case_study_2;

CREATE TABLE `position` (
  position_id INT auto_increment PRIMARY KEY,
  position_name VARCHAR(45)
);

CREATE TABLE education_degree (
  education_degree_id INT auto_increment PRIMARY KEY,
  education_degree_name VARCHAR(45)
);

CREATE TABLE division (
  division_id INT auto_increment PRIMARY KEY,
  division_name VARCHAR(45)
);

CREATE TABLE `user` (
  username VARCHAR(255) PRIMARY KEY,
  `password` VARCHAR(255)
);

CREATE TABLE employee (
  employee_id INT auto_increment PRIMARY KEY,
  employee_name VARCHAR(45),
  employee_birthday DATE,
  employee_id_card VARCHAR(45),
  employee_salary DOUBLE,
  employee_phone VARCHAR(45),
  employee_email VARCHAR(45),
  employee_address VARCHAR(45),
  position_id INT,
  education_degree_id INT,
  division_id INT,
  username VARCHAR(255),
  FOREIGN KEY (position_id) REFERENCES `position`(position_id),
  FOREIGN KEY (education_degree_id) REFERENCES education_degree(education_degree_id),
  FOREIGN KEY (division_id) REFERENCES division(division_id),
  FOREIGN KEY (username) REFERENCES `user`(username)
);

create table `role`(
role_id int auto_increment primary key,
role_name varchar(255)
);

create table user_role(
role_id int auto_increment,
username varchar(255),
foreign key (role_id) references `role`(role_id),
foreign key (username) references `user`(username)
);

create table customer_type(
customer_type_id int auto_increment primary key,
customer_type_name varchar(45)
);

create table customer(
customer_id int auto_increment primary key,
customer_type_id int,
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
foreign key (customer_type_id) references customer_type(customer_type_id)
); 

create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45)
);

create table rent_type(
rent_type_id int auto_increment primary key,
rent_type_name varchar(45),
rent_type_cost double
);

create table service(
service_id int auto_increment primary key,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int,
service_type_id int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_are double,
number_of_floors int,
foreign key (service_type_id) references service_type(service_type_id),
foreign key (rent_type_id) references  rent_type(rent_type_id)
);

create table contract(
contract_id int auto_increment primary key,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee(employee_id),
foreign key (customer_id) references customer(customer_id),
foreign key (service_id) references service(service_id)
);

create table contract_detail(
contract_detail_id int auto_increment primary key,
contract_id int,
attach_service_id int,
quantity int,
foreign key (contract_id) references contract(contract_id),
foreign key (attach_service_id) references attach_service(attach_service_id)
);

create table attach_service(
attach_service_id int auto_increment primary key,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);

-- Thêm dữ liệu vào bảng position
INSERT INTO `position` (position_id, position_name)
VALUES (1, 'Lễ tân'),
       (2, 'Phục vụ'),
       (3, 'Chuyên viên'),
       (4, 'Giám sát'),
       (5, 'Quản lý'),
       (6, 'Giám đốc');
       
-- Thêm dữ liệu vào bảng education_degree
INSERT INTO education_degree (education_degree_id, education_degree_name)
VALUES (1, 'Trung cấp'),
       (2, 'Cao đẳng'),
       (3, 'Đại học'),
       (4, 'Sau đại học');
       
-- Thêm dữ liệu vào bảng division 
INSERT INTO division (division_id, division_name)
VALUES (1, 'Sale - Marketing'),
       (2, 'Hành Chính'),
       (3, 'Phục vụ'),
       (4, 'Quản lý');
       
-- Thêm dữ liệu vào bảng user
INSERT INTO `user` (username, `password`)
VALUES ('admin', '123'),
		('user','123');

-- Thêm dữ liệu vào bảng role
INSERT INTO `role` (role_name) 
VALUES ('Admin'), ('User'), ('Guest');

-- Thêm dữ liệu vào bảng user_role
INSERT INTO user_role (role_id, username) 
VALUES (1, 'user'), (2, 'admin');
        
-- Thêm dữ liệu vào bảng employee
INSERT INTO employee (employee_id, employee_name, employee_birthday, employee_id_card, employee_phone, employee_email, education_degree_id, position_id, employee_salary, division_id, username)
VALUES  (1, 'Nguyễn Văn A', '1990-01-01', '123456789', '0123456789', 'nguyenvana@gmail.com', 3, 5, 10000000, 2, 'admin'),
		(2, 'Trần Thị B', '2003-01-01', '123456789', '0123456789', 'tranthib@gmail.com', 2, 5, 10000000, 2, 'user');

-- Thêm dữ liệu vào bảng customer_type
INSERT INTO customer_type (customer_type_id, customer_type_name)
VALUES (1, 'Diamond'),
       (2, 'Platinium'),
       (3, 'Gold'),
       (4, 'Silver'),
       (5, 'Member');
       
-- thêm dữ liệu vào bảng customer
INSERT INTO customer (customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)
VALUES (1, 'John Smith', '1985-03-03', 1, '111111111', '111111111', 'john.smith@example.com', '789 Oak St'),
(2, 'Jane Johnson', '1992-04-04', 0, '222222222', '222222222', 'jane.johnson@example.com', '321 Maple St');

-- thêm dữ liệu vào bảng contract
INSERT INTO contract (contract_start_date, contract_end_date, contract_deposit, contract_total_money, employee_id, customer_id, service_id)
VALUES ('2023-01-01 09:00:00', '2023-01-07 18:00:00', 1000, 5000, 1, 1, 1),
('2023-02-01 10:00:00', '2023-02-28 18:00:00', 2000, 10000, 2, 2, 2);

-- thêm dữ liệu vào attach_service
INSERT INTO attach_service (attach_service_name, attach_service_cost, attach_service_unit, attach_service_status)
VALUES ('Service 1', 50, 2, 'Active'), ('Service 2', 100, 1, 'Inactive');

-- thêm dữ liệu vào contract_detail
INSERT INTO contract_detail (contract_id, attach_service_id, quantity)
VALUES (1, 1, 2), (2, 2, 1);

-- Thêm dữ liệu cho bảng service_type
INSERT INTO service_type (service_type_id, service_type_name)
VALUES (1, 'Villa'),
       (2, 'House'),
       (3, 'Room');

-- Thêm dữ liệu vào bảng rent_type
INSERT INTO rent_type (rent_type_id, rent_type_name, rent_type_cost)
VALUES (1, 'Yearly', 365),
       (2, 'Monthly', 30),
       (3, 'Daily', 1),
       (4, 'Hourly', 0.04167);

-- Thêm dữ liệu cho dịch vụ Villa
INSERT INTO service (service_id, service_name, service_area, service_cost, service_max_people, rent_type_id, service_type_id, standard_room, description_other_convenience, pool_are, number_of_floors)
VALUES (1, 'Villa A', 200, 5000000, 6, 1, 1, 'Standard', 'Mô tả tiện nghi khác', 50, 2),
       (2, 'Villa B', 250, 6000000, 8, 1, 1, 'Deluxe', 'Mô tả tiện nghi khác', 80, 3);

-- Thêm dữ liệu cho dịch vụ House
INSERT INTO service (service_id, service_name, service_area, service_cost, service_max_people, rent_type_id, service_type_id, standard_room, description_other_convenience, number_of_floors)
VALUES (3, 'House A', 150, 3000000, 4, 1, 2, 'Standard', 'Mô tả tiện nghi khác', 2),
       (4, 'House B', 180, 3500000, 6, 1, 2, 'Deluxe', 'Mô tả tiện nghi khác', 3);

-- Thêm dữ liệu cho dịch vụ Room
INSERT INTO service (service_id, service_name, service_area, service_cost, service_max_people, rent_type_id, service_type_id, description_other_convenience)
VALUES (5, 'Room A', 50, 1000000, 2, 1, 3, 'Dịch vụ miễn phí đi kèm A'),
       (6, 'Room B', 60, 1200000, 2, 1, 3, 'Dịch vụ miễn phí đi kèm B');
       

       
select * from customer;





       
       


