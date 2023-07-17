/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1.BT2;

/**
 *
 * @author DELL
 */
public class Point3D extends Point2D {

    // Thuộc tính z
    private float z;

    // Phương thức khởi tạo có tham số
    public Point3D(float x, float y, float z) {
        // Gọi phương thức khởi tạo của lớp cha để thiết lập x, y
        super(x, y);
        // Thiết lập z
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setz(float z){
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {getX(), getY(), z};
    }
    public void setXYZ(float x, float y, float z){
        setXY(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }   
}
