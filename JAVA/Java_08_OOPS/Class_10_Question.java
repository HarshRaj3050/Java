// Create a class Square with a method to initialize its side, calculating area, perimeter etc.

package Java_08_OOPS;
import java.util.Scanner;
class Square {
    int side;
    int area() {
        return side * side;
    }
    int periMeter() {
        return 4 * side;
    }
}
public class Class_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Square sq = new Square();
        System.out.print("Enter the Square Side Length in meter : ");
        sq.side = scan.nextInt();
        System.out.println("Area of Square is : " + sq.area() + " meter");
        System.out.println("Perimeter of Square is : " + sq.periMeter() + " meter");
    }
}
