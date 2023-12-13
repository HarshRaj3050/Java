// Write a program to check a number is palindrome or not.

package Java_01_Basic;
import java.util.Scanner;
public class Basic_15_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int temp = num;
        int sum=0, r;
        while(temp > 0) {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp/10;
        }
        if(num == sum) {
            System.out.println(num + " is Palindrome Number");
        }
        else{
            System.out.println(num + " is Not Palindrome Number");
        }
    }
}
