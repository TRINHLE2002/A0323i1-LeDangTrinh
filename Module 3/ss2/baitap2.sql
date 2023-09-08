create database if not exists ss2_bt2;
use ss2_bt2;


create table customer(
cID int primary key not null,
cName varchar(50),
cAge int
);

create table `order`(
oID int primary key not null,
cID int,
oDate date,
oTotalPrice float
);

alter table `order` add foreign key (cID) references customer(cID);

create table product(
pID int primary key not null,
pName varchar(50),
pPice float
);

create table orderDetail(
oID int,
pID int,
odQTY varchar(50),
primary key(oID, pID),
foreign key (oID) references `order`(oID),
foreign key (pID) references product(pID)
);

ALTER TABLE orderDetail
MODIFY COLUMN odQTY float;