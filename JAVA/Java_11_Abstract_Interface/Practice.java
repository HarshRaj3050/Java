// Create an abstract class pen with methods write () and refill () as abstract methods

package Java_11_Abstract_Interface;
abstract class pen {
    abstract void write();
    abstract void refill();
}
class copy extends pen {
    void write() {
        System.out.println("Writing");
    }
    void refill() {
        System.out.println("Refilling");
    }
}
public class Practice {
    public static void main(String[] args) {
        copy copy = new copy();
    }
}