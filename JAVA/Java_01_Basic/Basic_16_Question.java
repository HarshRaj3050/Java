// Write a find the factor of particular number.

package Java_01_Basic;
import java.util.Scanner;
public class Basic_16_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        System.out.print("Factor of " + num + " is : ");
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                System.out.print(i);
                if(i!=num) {
                    System.out.print(", ");
                }
            }
        }
    }
}
