// Create a class Animal and Derive another class dog from it

package Java_09_AccessModifiers_Constructors;
import java.util.Scanner;
class Animals{
    String animalName;
    int animalNumber;
    Animals(String animal, int animalNumber) {
        this.animalName = animal;
        this.animalNumber = animalNumber;
    }
}
class Dog extends Animals {
    Dog(String name, int number) {
        super(name, number);
        System.out.println("The Dog Name is : " + animalName);
        System.out.println("Number of " + animalName + " is : " + animalNumber);
    }
}
public class Inheritance_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Dog Name : ");
        String aName = scan.next();
        System.out.print("Number of " + aName + " is : ");
        int aNumber = scan.nextInt();
        Animals dog = new Dog(aName, aNumber);
    }
}
