// Runtime Polymorphism with Data Members (Data members, in simple words, are nothing but variables).
// Runtime polymorphism isn't valid for data members (variables).

package Java_10_Inheritance_OverRiding;
class Cars{

    int speed = 60; //speed in mph
}
//Creating a child class for parent 'Cars'
class CarA extends Cars{

    int speed = 218; //speed in mph
}
//Creating a child class for parent 'Cars'
class CarB extends Cars{

    int speed = 221; //speed in mph
}
public class OverRiding_04_Code {
    public static void main(String[] args) {
        //Create an object of parent class
        Cars car = new Cars();
        System.out.println("Regular car: " + car.speed + " mph");

        //Create an object of child class
        car=new CarA(); //Upcasting
        System.out.println("Car A: " + car.speed + " mph");

        //Create an object of child class
        car=new CarB(); //Upcasting
        System.out.println("Car B: " + car.speed + " mph");
    }
}
/*  On accessing the value of the variable, it's clear that it doesn't change because
    overriding doesn't work on variables and it still refers to the variable of the parent class.
    So, the output remains 60. */
