// Write a Java program to convert Kilometers to miles.

package Java_01_Basic;
import java.util.Scanner;
public class Basic_12_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- Convert KILOMETERS to MILES -----");
        System.out.print("Enter the Kilometer : ");
        float kilo = scan.nextFloat();
        double mile = kilo * 0.621371;
        System.out.println(kilo + " Kilometer is : " + mile + " Miles");
    }
}
