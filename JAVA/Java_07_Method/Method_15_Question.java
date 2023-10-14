// Write a recursive function to calculate the Factorial of n Number.

package Java_07_Method;
import java.util.Scanner;
public class Method_15_Question {
    static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
    }
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
