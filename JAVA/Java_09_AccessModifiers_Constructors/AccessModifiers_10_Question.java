// Create a class cylinder and use getter and setters to set its radius and height, and find volume.(formula : πr²h)

package Java_09_AccessModifiers_Constructors;
import java.util.Scanner;
class Cylinder {
    private int radius;
    private int height;
    void setRadius(int r) {
        radius = r;
    }
    int getRadius() {
        return radius;
    }
    void setHeight(int h) {
        height = h;
    }
    int getHeight() {
        return height;
    }
    float cylinderVolume(float radius, float height) {
        float volume = 3.14f * (radius*radius) * height;
        return volume;
    }
}
public class AccessModifiers_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cylinder cy = new Cylinder();
        System.out.print("Enter the Radius : ");
        int radius = scan.nextInt();
        System.out.print("Enter the Height : ");
        int height = scan.nextInt();

        cy.setRadius(radius);
        cy.setHeight(height);
        System.out.println("Radius of Cylinder is : " + cy.getRadius() + ", and Height is : " + cy.getHeight());
        System.out.println("Volume of Cylinder is : " + cy.cylinderVolume(cy.getRadius(), cy.getHeight()));
    }
}
