/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap.BT1;

/**
 *
 * @author DELL
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle (double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getAre(){
       return Math.PI * radius * radius;
    }
    
}
