create database ss2_BT1;
use ss2_BT1;

create table phieuxuat(
sopx int primary key not null,
ngayxuat date
);

create table vattu(
mavtu int primary key not null,
tenvtu varchar(50)
);

create table phieuxuat_vattu(
mavtu int,
sopx int,
primary key(mavtu, sopx),
foreign key(sopx) references phieuxuat(sopx),
foreign key(mavtu) references vattu(mavtu)	
);

alter table phieuxuat_vattu add dgxuat float;
alter table phieuxuat_vattu add slxuat int;

create table phieunhap(
sopn int primary key not null,
ngaynhap date
);

create table vattu_phieunhap(
mavtu int,
sopn int,
dgnhap float,
slnhap int,
primary key(mavtu, sopn),
foreign key(mavtu) references vattu(mavtu),
foreign key(sopn) references phieunhap(sopn)
);

create table dondh(
sodh int primary key not null,
ngaydh date
);

create table vattu_dondh(
mavtu int,
sodh int,
primary key(mavtu, sodh),
foreign key (mavtu) references vattu(mavtu),
foreign key (sodh) references dondh(sodh)
);

alter table vattu_dondh add mancc int;
alter table vattu_dondh add foreign key (mancc) references nhacc(mancc);

create table nhacc(
mancc int primary key not null,
tenncc varchar(50),
diachi varchar(50),
sdt int
);
