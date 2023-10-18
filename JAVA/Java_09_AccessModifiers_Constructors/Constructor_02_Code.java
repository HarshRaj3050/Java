// Example of Defaut constructor and Paramerterized constructor.

package Java_09_AccessModifiers_Constructors;
//Defaut constructor Class
class Constructor1 {
    Constructor1() {
        System.out.println("Hello Word");
    }
}

// Paramerterized constructor Class
class Constructor2 {
    Constructor2(String name, int id) {
        System.out.println("Name is " + name + " and Id number is : " + id);
    }
}
public class Constructor_02_Code {
    public static void main(String[] args) {
        //code to be executed on the execution of the constructor
        Constructor1 constructor1 = new Constructor1();
        Constructor2 constructor2 = new Constructor2("Harsh Raj", 1004);
    }
}
