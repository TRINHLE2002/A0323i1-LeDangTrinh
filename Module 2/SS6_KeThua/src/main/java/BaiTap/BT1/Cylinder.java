/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1;

/**
 *
 * @author DELL
 */
public class Cylinder extends Circle{
     // Thuộc tính chiều cao của hình trụ
     private float height;

    // Phương thức khởi tạo có tham số
    public Cylinder(float radius, String color, float height) {
        // Gọi phương thức khởi tạo của lớp cha để thiết lập bán kính và màu sắc
        super(radius, color);
        // Thiết lập chiều cao của hình trụ
        this.height = height;
    }

    // Phương thức getter và setter cho chiều cao
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Phương thức tính thể tích hình trụ
    public float getVolume() {
        // Sử dụng phương thức getArea() của lớp cha để tính diện tích đáy hình trụ
        return getArena() * height;
    }

    // Phương thức cài đè để in ra thông tin chi tiết của đối tượng
    @Override
    public String toString() {
        return "Cylinder: \n radius=" + getRadius() + "\n color = " + getColor() + "\n height = " + height + "\n volume = " + String.format("%.2f", getVolume());
    }
}
