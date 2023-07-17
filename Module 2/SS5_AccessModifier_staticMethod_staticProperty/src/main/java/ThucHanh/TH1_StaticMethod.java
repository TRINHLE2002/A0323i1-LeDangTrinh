/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

/**
 *
 * @author DELL
 */
    public class  TH1_StaticMethod {
        private int rollno;
        private String name;
        private static String college = "BBDIT"; 
    TH1_StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String args[]) {
        TH1_StaticMethod.change(); //calling change method
        
        //creating objects
        TH1_StaticMethod s1 = new TH1_StaticMethod(111, "Hoang");
        TH1_StaticMethod s3 = new TH1_StaticMethod(333, "Nam");
        TH1_StaticMethod s2 = new TH1_StaticMethod(222, "Khanh");
        
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

