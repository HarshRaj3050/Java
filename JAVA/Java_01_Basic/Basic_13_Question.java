// Write a Java program to detect whether a number entered by the user is an integer or not.

package Java_01_Basic;
import java.util.Scanner;
public class Basic_13_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Enter the number if number is integer return 'true' else 'false'-----");
        System.out.print("Enter the number : ");
        System.out.println(scan.hasNextInt());
    }
}
