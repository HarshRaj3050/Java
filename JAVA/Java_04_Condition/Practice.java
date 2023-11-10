/* Write a program to find out whether a student is pass or fail; if it requires a total of
   40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
 */

package Java_04_Condition;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Practice{
    public static void teacher(int [] arr) {
        float totalPercent = (arr[0] + arr[1] + arr[2]) / 300f;
        if(arr[0]>=33 && arr[1]>=33 && arr[2]>=33) {
            if(totalPercent >= 0.4) {
                System.out.println("You are Pass");
            }
            else {
                System.out.println("You are Fail because 40% requires of total");
            }
        }
        else {
            System.out.println("You are Fail because 33% requires in each subject");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[3];
        for(int i=0; i<3; i++) {
            System.out.printf("%d. Enter Marks : ", i+1);
            arr[i] = scan.nextInt();
        }
        teacher(arr);
    }
}