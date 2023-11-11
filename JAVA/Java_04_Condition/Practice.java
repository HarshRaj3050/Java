// Write a Java program to find whether a year entered by the user is a leap year or not.

package Java_04_Condition;
import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap Year");
        }
        else if (year % 400 == 0){
            System.out.println(year + " is leap Year");
        }
        else {
            System.out.println(year + " is Not leap Year");
        }
    }
}