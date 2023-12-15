// Write a program to check if the given number is Armstrong or not.

package Java_01_Basic;
import java.util.Scanner;
public class Basic_17_Question {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int result = armStrong(num);

        if(result == num) {
            System.out.println(num + " is Armstrong Number");
        }
        else {
            System.out.println(num + " is Not Armstrong Number");
        }
    }
    static int armStrong(int num) {
        int remain, result=0;
        while(num > 0) {
            remain = num % 10;
            num = num / 10;
            result = result + (remain*remain*remain);
        }
        return result;
    }
}