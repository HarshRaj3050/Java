//Java Program to illustrate the use of Java Method Overriding

package Java_10_Inheritance_OverRiding;
class Amit {
    void writing() {
        System.out.println("java");
    }
}
class Amit5 extends Amit {
    @Override
    void writing() {
        System.out.println("Python");
    }
}
public class Practice {

    public static void main(String[] args) {
        Amit ab = new Amit();
        Amit5 a = new Amit5();
        ab.writing();
        a.writing();
    }
}