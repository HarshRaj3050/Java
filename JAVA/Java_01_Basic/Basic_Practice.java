// Create a class Square with a method to initialize its side, calculating area, perimeter etc.

package Java_01_Basic;
import java.util.Scanner;
class Square{
    int side;
    Square (int side) {
        this.side = side;
    }
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}
class Basic_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Side in meter : ");
        int side = scan.nextInt();
        Square sq = new Square(side);

        System.out.println("Area of Square is : " + sq.area());
        System.out.println("Primeter of Square is : " + sq.perimeter());
    }
}