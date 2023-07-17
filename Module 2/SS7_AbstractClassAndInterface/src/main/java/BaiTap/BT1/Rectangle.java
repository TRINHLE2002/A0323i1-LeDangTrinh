/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1;

/**
 *
 * @author DELL
 */
public abstract class Rectangle implements Resizeable{
    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double area(){
        return width * height;
    }
    
    @Override
     public void resize(double percent) {
        double oldArea = area();
        width *= (1 + percent/100);
        height *= (1 + percent/100);
        System.out.println("Rectangle area before resizing: " + oldArea/(1 + percent/100)/(1 + percent/100));
        System.out.println("Rectangle area after resizing: " + area());
    }
}
