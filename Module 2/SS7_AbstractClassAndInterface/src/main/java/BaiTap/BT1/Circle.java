/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1;

/**
 *
 * @author DELL
 */
public abstract class Circle implements Resizeable{
   private double radius; 
   
   public Circle(double radius){
        this.radius = radius;
   }
   
   public double area(){
        return Math.PI * radius * radius;
   }
   
   @Override
  public void resize(double percent) {
        double oldArea = area();
        radius *= (1 + percent/100);
        System.out.println("Circle area before resizing: " + oldArea/(1 + percent/100)/(1 + percent/100));
        System.out.println("Circle area after resizing: " + area());
    }
}

