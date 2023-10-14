// Write a function to print the nth term of the Fibonacci series using recursion.

package Java_07_Method;
import java.util.Scanner;
public class Method_13_Question {
    static int fibonacci(int num) {
        if(num == 0 || num == 1) {
            return num;
        }
        else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int fibo = fibonacci(num);
        System.out.println("Fibonacci of " + num + " is : " + fibo);
    }
}
