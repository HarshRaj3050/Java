// Example of an Interface, the Drawable interface has only one method.
// Its implementation is provided by Rectangle and Circle classes.

package Java_11_Abstract_Interface;
import java.util.Scanner;
interface Area {
    void area();
}
class Rectangle2 implements Area {
    int l,b;
    Rectangle2 (int l, int b) {
        this.l = l;
        this.b = b;
    }
    public void area() {
        int area;
        area = l*b;
        System.out.println("Area of Rectangle : " + area);
    }
}
class Circle2 implements Area {
    int r;
    Circle2(int r) {
        this.r = r;
    }
    public void area() {
        float areaOfCircle;
        areaOfCircle = 3.14f * (r * r);
        System.out.println("Area of Circle : " + areaOfCircle);
    }
}
public class Practice {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the L : ");
        int l = scan.nextInt();
        System.out.print("Enter the B : ");
        int b = scan.nextInt();
        System.out.print("Enter the Radius : ");
        int r = scan.nextInt();
        Rectangle2 rect = new Rectangle2(l,b);
        Circle2 circle = new Circle2(r);
        rect.area();
        circle.area();



    }
}