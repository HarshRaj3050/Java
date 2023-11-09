// Write Java Program to Find Greatest of Two Numbers

package Java_04_Condition;
import java.util.Scanner;
public class Practice{
    public static void greatestNum(int num1, int num2) {
        if(num1 == num2) {
            System.out.println("Both Number is Same");
        }
        else if (num1 > num2) {
            System.out.println("First Number is Greatest");
        }
        else {
            System.out.println("Second Number is Greatest");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();
        greatestNum(num1, num2);
    }
}