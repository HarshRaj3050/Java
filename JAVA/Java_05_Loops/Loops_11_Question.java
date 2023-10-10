// Write a program to sum first n even numbers using a while loop.

package Java_05_Loops;
import java.util.Scanner;
public class Loops_11_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        while(i<n) {
            sum = (i*2) + sum;
            i++;
        }
        System.out.printf("The sum of first %d even numbers is : %d", n,sum);
    }
}
