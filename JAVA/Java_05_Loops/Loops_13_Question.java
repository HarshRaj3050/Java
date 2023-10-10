// Write a program to find the factorial of a given number using for loops.

package Java_05_Loops;
import java.util.Scanner;
public class Loops_13_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int i = 1;
        int fact = 1;
        while(i<=num) {
            fact = fact * i;
            i++;
        }
        System.out.printf("The Factorial of %d is : %d", num, fact);

    }
}
