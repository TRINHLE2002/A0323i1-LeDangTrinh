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
    private float radius;
    private String color;
    
    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public float getRadius(){
        return radius;
    }
    
    public void setRadius(float radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public float getArena(){
        return (float) (Math.PI * radius * radius);
    }
    
    @Override
    public String toString(){
        return "Circle : \n radius = " + radius + "\n Color = " + color + "\n Arena = " + String.format("%.2f",getArena());
}
}
   
