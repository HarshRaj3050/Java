//Java Program to illustrate the use of Java Method Overriding

package Java_10_Inheritance_OverRiding;
import java.util.Scanner;
class Super1 {
    String name;
    Super1(String name) {
        this.name = name;
        System.out.println("Hello " + name);
    }
}
class Sub1 extends Super1 {
    Sub1(String name) {
        super(name);
    }
}
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scan.nextLine();
        Sub1 sub = new Sub1(name);
    }
}