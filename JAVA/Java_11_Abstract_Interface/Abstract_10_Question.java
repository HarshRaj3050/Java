// Create an abstract class pen with methods write () and refill () as abstract methods

package Java_11_Abstract_Interface;
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class BallPen extends Pen {
    @Override
    void write() {
        System.out.println("Write a sentence....");
    }

    @Override
    void refill() {
        System.out.println("Refill this BallPen....");
    }
}
public class Abstract_10_Question {
    public static void main(String[] args) {
        BallPen pen1 = new BallPen();
        pen1.write();
        pen1.refill();
    }
}
