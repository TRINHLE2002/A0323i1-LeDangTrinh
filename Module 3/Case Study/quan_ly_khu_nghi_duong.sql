create database case_study;
use case_study;

create table vi_tri(
ma_vi_tri int primary key,
ten_vi_tri varchar(45)
);

create table trinh_do(
ma_trinh_do int primary key,
ten_trinh_do varchar(45)
);

create table bo_phan(
ma_bo_phan int primary key,
ten_bo_phan varchar(45)
);

create table nhan_vien(
ma_nhan_vien int primary key,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
ma_loai_khach int primary key,
ten_loai_khach varchar(45)
);

create table khach_hang(
ma_khach_hang int primary key,
ma_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table hop_dong(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table loai_dich_vu(
ma_loai_dich_vu int primary key,
ten_loai_dich_vu varchar(45)
);

create table dich_vu(
ma_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
ma_kieu_thue int,
ma_loai_dich_vu int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
dich_vu_mien_phi_di_kem text,
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue)
);

create table kieu_thue(
ma_kieu_thue int primary key,
ten_kieu_thue varchar(45)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
trang_thai varchar(45)
);

alter table dich_vu_di_kem add primary key (ma_dich_vu_di_kem);

-- Thêm Data vào các table
insert into vi_tri(ma_vi_tri,ten_vi_tri) values (1,'Quản lý'),(2,'Nhân viên');

insert into trinh_do(ma_trinh_do,ten_trinh_do) values (1,'Trung cấp'),(2,'Cao đẵng'),(3,'Đại học'),(4,'Sau đại học');

insert into bo_phan(ma_bo_phan,ten_bo_phan) values (1,'Sale-Marketing'),(2,'Hành chính'),(3,'Phục vụ'),(4,'Quản lý');

insert into Nhan_vien(ma_nhan_vien,ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) 
values (1,'Nguyễn Văn An','1970-11-07','456231786','10000000','0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),
(2,'Lê Văn Bình','1997-04-09','654231234','7000000','0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
(3,'Hồ Thị Yến','1995-12-12','999231723','14000000','0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
(4,'Võ Công Toản','1980-04-04','123231365','17000000','0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
(5,'Nguyễn Bỉnh Phát','1999-12-09','454363232','6000000','0902341231','0902341231','43 Yên Bái, Đà Nẵng',2,1,1),
(6,'Khúc Nguyễn An Nghi','2000-11-08','964542311','7000000','0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),
(7,'Nguyễn Hữu Hà','1993-01-01','534323231','8000000','0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),
(8,'Nguyễn Hà Đông','1989-09-03','234414123','9000000','0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
(9,'Tòng Hoang','1982-09-03','256781231','6000000','0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
(10,'Nguyễn Công Đạo','1994-01-08','755434343','8000000','0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);

insert into loai_khach(ma_loai_khach,ten_loai_khach) values (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');

insert into khach_hang(ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) 
values (1,'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
(2,'Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
(3,'Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
(4,'Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
(5,'Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
(6,'Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
(7,'Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
(8,'Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
(9,'Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
(10,'Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);

insert into kieu_thue(ma_kieu_thue,ten_kieu_thue) values (1,'year'),(2,'month'),(3,'day'),(4,'hour');

insert into loai_dich_vu(ma_loai_dich_vu,ten_loai_dich_vu) values (1,'Villa'),(2,'House'),(3,'Room');

insert into dich_vu(ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang) value ('1', 'Villa Beach Front', '25000', '1000000', '10', '3', '1', 'vip', 'Có hồ bơi', '500', '4'),
('2', 'House Princess 01', '14000', '5000000', '7', '2', '2', 'vip', 'Có thêm bếp nướng', '3'),
('3', 'Room Twin 01', '5000', '1000000', '2', '4', '3', 'normal', 'Có tivi', '1 Xe máy, 1 Xe đạp'),
('4', '1 Xe máy, 1 Xe đạp', '22000', '9000000', '8', '3', '1', 'normal', 'Có hồ bơi', '300', '3'),
('5', 'House Princess 02', '10000', '4000000', '5', '3', '2', 'normal', 'Có thêm bếp nướng', '', '2'),
('6', 'Room Twin 02', '3000', '900000', '2', '4', '3', 'normal', 'Có tivi', '1 Xe máy');
update dich_vu set ten_dich_vu = 'Villa No Beach Front' where ma_dich_vu = 4;

insert into dich_vu_di_kem(ma_dich_vu_di_kem,ten_dich_vu_di_kem,gia,don_vi,trang_thai) values (1,'Karaoke',10000,'giờ','tiện nghi, hiện tại'),
(2,'Thuê xe máy',10000,'chiếc','hỏng 1 xe'),
(3,'Thuê xe đạp',20000,'chiếc','tốt'),
(4,'Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng'),
(5,'Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng'),
(6,'Buffet buổi tối',16000,'suất','đầy đủ đồ ăn, tráng miệng');

insert into hop_dong(ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu) values (1,'2020-12-08','2020-12-08','0',3,1,3),
(2,'2020-07-14','2020-07-21','200000',7,3,1), 
(3,'2021-03-15','2021-03-17','50000',3,4,2),
(5,'2021-07-14','2021-07-15','0',7,2,6),
(6,'2021-06-01','2021-06-03','0',7,7,6),
(7,'2021-09-02','2021-09-05','100000',7,4,4),
(8,'2021-06-17','2021-06-18','150000',3,4,1),
(9,'2020-11-19','2020-11-19','0',3,4,3),
(10,'2021-04-12','2021-04-14','0',10,3,5),
(11,'2021-04-25','2021-04-25','0',2,2,1),
(12,'2021-05-25','2021-05-27','0',7,10,1);
insert into hop_dong(ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu) values (4,'2021-01-14','2021-01-18',100000,7,5,5);


insert into hop_dong_chi_tiet(ma_hop_dong_chi_tiet,so_luong,ma_hop_dong,ma_dich_vu_di_kem) values (1,5,2,4),(2,8,2,5),(3,15,2,6),(4,1,3,1),(5,11,3,2),(6,1,1,3),(7,2,1,2),(8,2,12,2);

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where ho_ten regexp '^[HTK].{0,14}$';

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
-- datediff(now(), ngay_sinh) tính số ngày giữa ngày hiện tại và ngày sinh của khách hàng.
-- from_days() chuyển số ngày được tính toán thành một ngày.
-- date_format(...,'%Y') trích xuất năm từ ngày tính toán để lấy độ tuổi.
select * from khach_hang where date_format(from_days(datediff(now(), ngay_sinh)), '%Y') BETWEEN 18 AND 50
and (dia_chi like '%Đà Nẵng' or dia_chi like '% Quảng Trị');

-- 4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select K.ma_khach_hang, K.ho_ten,count(1) as so_lan_dat from hop_dong H
 join khach_hang K on H.ma_khach_hang = K.ma_khach_hang
 join loai_khach LK on Lk.ma_loai_khach = K.ma_loai_khach
 where Lk.ten_loai_khach = 'Diamond'
 group by K.ma_khach_hang, K.ho_ten, Lk.ten_loai_khach
 order by so_lan_dat ;
 
-- 5. 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). 

select k.ma_khach_hang,k.ho_ten,l.ten_loai_khach,h.ma_hop_dong,d.ten_dich_vu,h.ngay_lam_hop_dong,h.ngay_ket_thuc,sum(d.chi_phi_thue + g.so_luong * e.gia) as tong_tien
from khach_hang k left join hop_dong h on k.ma_khach_hang = h.ma_khach_hang
left join loai_khach l on k.ma_loai_khach = l.ma_loai_khach
left join dich_vu d on h.ma_dich_vu = d.ma_dich_vu
left join hop_dong_chi_tiet g on h.ma_hop_dong = g.ma_hop_dong
left join dich_vu_di_kem e on g.ma_dich_vu_di_kem = e.ma_dich_vu_di_kem
group by k.ma_khach_hang,k.ho_ten,l.ten_loai_khach,h.ma_hop_dong,d.ten_dich_vu,h.ngay_lam_hop_dong,h.ngay_ket_thuc
;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select  d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.chi_phi_thue,j.ten_loai_dich_vu from dich_vu d 
left join loai_dich_vu j on d.ma_loai_dich_vu = j.ma_loai_dich_vu 
join hop_dong h on d.ma_dich_vu = h.ma_dich_vu
where d.ma_dich_vu not in (
    select distinct h.ma_dich_vu
    from hop_dong
	where month (h.ngay_lam_hop_dong) in (1,2,3)
    and year(h.ngay_lam_hop_dong) = 2021)
group by d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.chi_phi_thue,j.ten_loai_dich_vu 
order by j.ten_loai_dich_vu;

-- 7.Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng 
-- trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select  d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.so_nguoi_toi_da,d.chi_phi_thue,j.ten_loai_dich_vu from dich_vu d 
left join loai_dich_vu j on d.ma_loai_dich_vu = j.ma_loai_dich_vu 
join hop_dong h on d.ma_dich_vu = h.ma_dich_vu
where d.ma_dich_vu IN (
    SELECT DISTINCT ma_dich_vu
    FROM hop_dong
    WHERE YEAR(ngay_lam_hop_dong) = 2020
)
AND d.ma_dich_vu NOT IN (
    SELECT DISTINCT ma_dich_vu
    FROM hop_dong
    WHERE YEAR(ngay_lam_hop_dong) = 2021
)
group by ma_dich_vu;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- cách 1:
select distinct ho_ten from khach_hang;
-- cách 2: 
select min(ho_ten) as ho_ten
from khach_hang
group by ho_ten;
-- cách 3:
select k1.ho_ten from khach_hang k1
left join khach_hang k2 ON k1.ho_ten = k2.ho_ten AND k1.ma_khach_hang > k2.ma_khach_hang
where k2.ho_ten is null;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong) as thang, count(distinct ma_khach_hang) as so_luong_khach_hang from hop_dong
where year(ngay_lam_hop_dong) = 2021
group by month(ngay_lam_hop_dong);


-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select h.ma_hop_dong,h.ngay_lam_hop_dong,h.ngay_ket_thuc,h.tien_dat_coc,coalesce(sum(h2.so_luong),0) as so_luong_dich_vu_di_kem
from hop_dong h left join hop_dong_chi_tiet h2 on h.ma_hop_dong = h2.ma_hop_dong
group by h.ma_hop_dong,h.ngay_lam_hop_dong,h.ngay_ket_thuc,h.tien_dat_coc;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond”
-- và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dv.ma_dich_vu_di_kem,dv.ten_dich_vu_di_kem
from dich_vu_di_kem dv
join hop_dong_chi_tiet hct on dv.ma_dich_vu_di_kem = hct.ma_dich_vu_di_kem
join hop_dong hd on hct.ma_hop_dong = hd.ma_hop_dong
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
where lk.ten_loai_khach = 'Diamond' and (kh.dia_chi like '% Vinh' OR kh.dia_chi like '% Quảng Ngãi');

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc 
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hd.ma_hop_dong,nv.ho_ten as ho_ten_nhan_vien,kh.ho_ten as ho_ten_khach_hang, kh.so_dien_thoai,dv.ten_dich_vu,sum(hd2.so_luong) as so_luong_dich_vu_di_kem,hd.tien_dat_coc
from hop_dong hd 
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join hop_dong_chi_tiet hd2 on hd.ma_hop_dong = hd2.ma_hop_dong
join dich_vu_di_kem dvdk on hd2.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
where (year(hd.ngay_lam_hop_dong) = 2020 and month(hd.ngay_lam_hop_dong) >= 10)
  and (year(hd.ngay_lam_hop_dong) = 2021 and month(hd.ngay_lam_hop_dong) <= 6)
group by hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu, hd.tien_dat_coc
;


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem, count(*) as so_luong_dich_vu_di_kem from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hd2 on dvdk.ma_dich_vu_di_kem = hd2.ma_dich_vu_di_kem
join hop_dong hd on hd2.ma_hop_dong = hd.ma_hop_dong
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
group by dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem
;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).

select distinct hd.ma_hop_dong,ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem,count(dvdk.ma_dich_vu_di_kem) as so_luong_su_dung
from hop_dong hd 
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
join hop_dong_chi_tiet hd2 on hd.ma_hop_dong = hd2.ma_hop_dong
join dich_vu_di_kem dvdk on hd2.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by hd.ma_hop_dong,ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem
having count(dvdk.ma_dich_vu_di_kem) = 1;

-- 15.Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select nv.ma_nhan_vien,nv.ho_ten,td.ten_trinh_do,bp.ten_bo_phan,nv.so_dien_thoai,nv.dia_chi from nhan_vien nv
join trinh_do td on nv.ma_trinh_do = td.ma_trinh_do
join bo_phan bp on nv.ma_bo_phan = bp.ma_bo_phan
join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien
where year(hd.ngay_lam_hop_dong) >= 2020 and year(hd.ngay_lam_hop_dong) <= 2021
group by nv.ma_nhan_vien
having count(distinct hd.ma_hop_dong) <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from nhan_vien
where ma_nhan_vien not in(
select nv1.ma_nhan_vien from hop_dong hd 
join nhan_vien nv1 on hd.ma_nhan_vien = nv1.ma_nhan_vien
where year(hd.ngay_lam_hop_dong) >= 2019 and year(hd.ngay_lam_hop_dong) <= 2021
group by hd.ma_hop_dong
);

