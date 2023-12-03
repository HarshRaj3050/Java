//Java Program to illustrate the use of Java Method Overriding

package Java_10_Inheritance_OverRiding;
class Super1 {
    String name;
    Super1(String name) {
        this.name = name;
        System.out.println("Hello " + name);
    }
}
class Sub1 extends Super1 {
    Sub1 {
        super(name);
    }
}
public class Practice {
}