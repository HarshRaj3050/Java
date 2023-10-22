//Java Program to illustrate the use of Java Method Overriding

package Java_10_Inheritance_OverRiding;
class Vehicle{
    void run() {
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}
public class OverRiding_01_Code {
    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}

