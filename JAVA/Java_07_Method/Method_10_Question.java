// Write a Java method to print the multiplication table of a number n.

package Java_07_Method;
import java.util.Scanner;
public class Method_10_Question {
    static void table(int num) {
        System.out.println("-----TABLE OF " + num + "-----");
        for(int i=1; i<11; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        table(num);
    }
}
