/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1.BT2;

/**
 *
 * @author DELL
 */
public class Point2D {
  // Thuộc tính x, y
    private float x;
    private float y;

    // Phương thức khởi tạo có tham số
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức getter và setter cho x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Phương thức getter và setter cho y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Phương thức trả về một mảng chứa x, y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Phương thức khác để thiết lập x, y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức trả về một chuỗi biểu diễn đối tượng
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
