// Write a JAVA code Add any two number. ( User can inter number )

package Java_01_Basic;
import java.util.Scanner;
class Basic_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int first = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int second = scan.nextInt();
        int result = first + second;
        System.out.println("Sum is : " + result);
    }
}