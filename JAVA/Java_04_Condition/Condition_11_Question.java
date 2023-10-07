/* Write a program to find out whether a student is pass or fail; if it requires a total of
   40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
 */

package Java_04_Condition;
import java.util.Scanner;
public class Condition_11_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first subject marks : ");
        int sub1 = scan.nextInt();
        System.out.print("Enter second subject marks : ");
        int sub2 = scan.nextInt();
        System.out.print("Enter third subject marks : ");
        int sub3 = scan.nextInt();
        float total = sub1 + sub2 + sub3;
        float totalAvg = (total /300) * 100;

        if(totalAvg >= 40) {
            if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
                System.out.println("You are PASS");
            }
            else {
                System.out.println("You are FAIL, because least 33% each subject");
            }
        }
        else {
            System.out.println("You are FAIL");
        }

    }
}
