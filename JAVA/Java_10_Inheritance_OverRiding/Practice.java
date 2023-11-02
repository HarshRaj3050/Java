/* Create a class circle and use inheritance to create another class cylinder and find the
   Area of Circle and Volume of Cylinder, user can Enter the Radius and Height.
 */

package Java_10_Inheritance_OverRiding;
class Circle1 {
    public int radius;
    public Circle1(int radius) {
        this.radius = radius;
    }
    public void areaCircle() {
        System.out.printf("Area of Circle is : %.2f\n", 3.14f * (radius * radius));
    }
}
class Cylinder1 extends Circle1 {
    int height;
    public Cylinder1(int radius, int height) {
        super(radius);
        this.height = height;
    }
    public void areaCylinder() {
        System.out.printf("Volume of Cylinder is : %.2f\n", 3.14f * (radius*radius) * height);
    }
}
public class Practice {
    public static void main(String[] args) {
        Cylinder1 cylinder = new Cylinder1(5,3);
        cylinder.areaCircle();
        cylinder.areaCylinder();
    }
}