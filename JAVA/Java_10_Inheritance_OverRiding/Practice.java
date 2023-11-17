// Create a class Animal and Derive another class dog from it. and Enter Name and Age

package Java_10_Inheritance_OverRiding;
import java.util.Scanner;
class Animal2 {
    int age;
    String name;
    Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void details () {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
class Dog2 extends Animal2 {
    Dog2(String name, int age) {
        super(name,age);
    }
}
public class Practice {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Age : ");
        int age = scan.nextInt();
        Dog2 dog = new Dog2(name, age);
        dog.details();
    }
}