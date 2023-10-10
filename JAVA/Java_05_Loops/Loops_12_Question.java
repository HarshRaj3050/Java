// Write a program to print the multiplication table of a given number n.

package Java_05_Loops;
import java.util.Scanner;
public class Loops_12_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
        System.out.printf("-----Table of %d-----\n", n);
        for(int i=1; i<=10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}
