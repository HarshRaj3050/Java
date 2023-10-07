// Write Java Program to Find Greatest of Two Numbers

package Java_04_Condition;
import java.util.Scanner;
public class Condition_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int a = scan.nextInt();
        System.out.print("Enter Second number : ");
        int b = scan.nextInt();

        if(a>b) {
            System.out.println("First Number is Greater");
        }
        else {
            System.out.println("Second Number is Greater");
        }
    }
}
