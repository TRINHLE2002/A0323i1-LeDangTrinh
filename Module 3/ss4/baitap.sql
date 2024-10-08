use quanlysinhvien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from `subject`
where credit = (select max(credit) from subject);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.*, m.mark
from `subject` s
left join mark m on s.SubId = m.SubId
where mark = (select max(mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT s.*, AVG(m.mark) AS avg_mark
FROM student s
LEFT JOIN mark m ON s.StudentId = m.StudentId
GROUP BY s.StudentId
ORDER BY avg_mark DESC;

