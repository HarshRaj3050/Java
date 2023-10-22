//Java Program use of Java Method Overriding

package Java_09_AccessModifiers_Constructors;

class Super {
    int x;
    Super(int x) {
        this.x = x;
    }
    void display() {
        System.out.println("Super x = " + x);
        }
    }
class Sub extends Super {
    int y;
    Sub(int x, int y) {
        super(x);
        this.y = y;
    }
    @Override
    void display() {
        System.out.println("Super x = " + x);
        System.out.println("Sub y = " + y);
    }
}
public class OverRiding_02_Code {
    public static void main(String[] args) {
        Sub s1 = new Sub(100,200);
        s1.display();
    }
}
