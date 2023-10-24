// Example of an Interface, the Drawable interface has only one method.
// Its implementation is provided by Rectangle and Circle classes.

package Java_11_Abstract_Interface;
//Interface declaration
interface Drawable {
    void draw();
}
class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Interface_01_Code {
    public static void main(String[] args) {
        Drawable d = new Circle1();
        d.draw();
    }
}
