/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

/**
 *
 * @author DELL
 */
public class TH2_StaticProperty {
    private String name;

    private String engine;

 

    public static int numberOfCars;

 

    public TH2_StaticProperty(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
    public static void main(String[] args) {

        TH2_StaticProperty car1 = new TH2_StaticProperty("Mazda 3","Skyactiv 3");

        System.out.println(TH2_StaticProperty.numberOfCars);

        TH2_StaticProperty car2 = new TH2_StaticProperty("Mazda 6","Skyactiv 6");

        System.out.println(TH2_StaticProperty.numberOfCars);

    }
}
