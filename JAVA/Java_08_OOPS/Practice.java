// Create a class Square with a method to initialize its side, calculating area, perimeter etc.

package Java_08_OOPS;
import java.util.Scanner;
class Square1 {
    int side;
    int squareArea() {
        return side * side;
    }
    int squareParimeter() {
        return 4 * side;
    }
}
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Square1 sq = new Square1();
        System.out.print("Enter the Side in meter : ");
        sq.side = scan.nextInt();
        System.out.println("Area of Square is : " + sq.squareArea());
        System.out.println("Perimeter of Square is : " + sq.squareParimeter());
    }
}
