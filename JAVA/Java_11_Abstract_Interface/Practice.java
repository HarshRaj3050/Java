// Create an abstract class pen with methods write () and refill () as abstract methods

package Java_11_Abstract_Interface;
abstract class Pen1 {
    abstract void write();
    abstract void refill();
}
class BallPen1 extends Pen {
    void write() {
        System.out.println("Hello World");
    }
    void refill() {
        System.out.println("This pen is black");
    }
}
public class Practice {
    public static void main(String[] args) {
        BallPen1 ballPen = new BallPen1();
        ballPen.write(); // for print text
        ballPen.refill(); // 
    }
}