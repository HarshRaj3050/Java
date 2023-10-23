/*  Understanding the real scenario of Abstract class
    Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.
 */

package Java_11_Abstract_Interface;
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Abstract_01_Code {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
