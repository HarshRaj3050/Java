// Create a class Animal and Derive another class dog from it. and Enter Name and Age

package Java_10_Inheritance_OverRiding;
class Animal2 {
    int age;
    String name;
    Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void name (String name) {
        System.out.println("Name is : " + name);
    }
    void age (int age) {
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

    }
}