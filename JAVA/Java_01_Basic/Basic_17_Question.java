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
        // Count the Number of digits
        int count=0, temp;
        temp = num;
        while(temp>0) {
            temp = temp/10;
            count++;
        }
        // Split into single digit and Sum
        int remain, singleDigit, result=0;
        while(num > 0) {
            remain = num % 10;
            singleDigit = 1;
            for(int i=1; i<=count; i++) {
                singleDigit = singleDigit * remain;
            }
            result = result + singleDigit;
            num = num / 10;
        }
        return result;
    }
}