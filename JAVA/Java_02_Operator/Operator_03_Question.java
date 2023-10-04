// Use comparison operators to find out whether a given number is greater than the user entered number or not.

package Java_02_Operator;
import java.util.Scanner;
public class Operator_03_Question {
    public static void main(String[] args) {
        System.out.println("---Given number is greater than the user entered number (return 'ture' else 'false')---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Given number = 10");
        System.out.print("Enter Your number : ");
        int num = scan.nextInt();
        System.out.println(10 < num);
    }
}
