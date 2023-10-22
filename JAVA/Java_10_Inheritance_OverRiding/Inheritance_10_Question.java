// Create a class Animal and Derive another class dog from it. and Enter Name and Age

package Java_10_Inheritance_OverRiding;
import java.util.Scanner;
class Animals{
    String animalName;
    int animalAge;
    Animals(String animal, int animalNumber) {
        this.animalName = animal;
        this.animalAge = animalNumber;
    }
}
class Dog extends Animals {
    Dog(String name, int number) {
        super(name, number);
        System.out.println("The Dog Name is : " + animalName);
        System.out.println("AGE of " + animalName + " is : " + animalAge);
    }
}
public class Inheritance_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Dog Name : ");
        String aName = scan.next();
        System.out.print("AGE of " + aName + " is : ");
        int aNumber = scan.nextInt();
        Animals dog = new Dog(aName, aNumber);
    }
}
