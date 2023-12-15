// Write a program to check if the given number is Armstrong or not.

package Java_01_Basic;
import java.util.Scanner;
class Basic_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int result = armStrong(num);

        if(num == result) {
            System.out.println(num + " is Armstrong Number");
        }
        else {
            System.out.println(num + " is Not Armstrong Number");
        }
    }
    static int armStrong(int num) {
        int result=0, remain;
        while(num > 0) {
            remain = num % 10;
            result = result + (remain * remain * remain);
            num = num / 10;
        }
        return result;
    }
}