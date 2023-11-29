/* Create a class circle and use inheritance to create another class cylinder and find the
   Area of Circle and Volume of Cylinder, user can Enter the Radius and Height.
 */

package Java_10_Inheritance_OverRiding;
import java.util.Scanner;
class Cylinder3 {
    int radius, height;
    Cylinder3(int r, int h) {
        radius = r;
        height = h;
    }
    void cylinArea() {
        System.out.println("Area of Cylinder is : " + (3.14f * (radius * radius) * height));
    }

}
class Circle3 extends Cylinder3 {
    Circle3(int radius, int height) {
        super(radius, height);
    }
    void circleArea() {
        System.out.println("Area of Circle is : " + (3.14f * (radius * radius)));
    }

}
public class Practice {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int radius = scan.nextInt();
        System.out.print("Enter the Height : ");
        int height = scan.nextInt();
        Circle3 area = new Circle3(radius, height);
        area.cylinArea();
        area.circleArea();
    }
}