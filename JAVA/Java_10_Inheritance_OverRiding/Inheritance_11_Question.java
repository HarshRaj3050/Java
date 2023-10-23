/* Create a class circle and use inheritance to create another class cylinder and find the
   Area of Circle and Volume of Cylinder, user can Enter the Radius and Height.
 */

package Java_10_Inheritance_OverRiding;
import java.util.Scanner;
class Circle {
    public int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    float circleArea() {
        return (float) Math.PI * radius * radius;
    }
}
class Cylinder extends Circle {
    int height;
    Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }
    float cylinderVolume() {
        return (float) Math.PI * radius * radius * height;
    }
}
public class Inheritance_11_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int r = scan.nextInt();
        System.out.print("Enter the Height : ");
        int h = scan.nextInt();

        Cylinder cy = new Cylinder(r, h);
        System.out.println("Area of Circle is : " + cy.circleArea());
        System.out.println("Volume of Cylinder is : " + cy.cylinderVolume());
    }
}
