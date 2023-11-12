/*  Write a Java program to find out the day of the week given the number
    [1 for Monday, 2 for Tuesday … and so on!]  */

package Java_04_Condition;
import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 for Monday\n2 for Tuesday\n3 for Wednesday\n4 for Thursday\n" +
                "5 for Friday\n6 for Saturday\n7 for Sunday");
        System.out.print("----Enter the Number : ");
        int num = scan.nextInt();
        if(num>=1 && num<=7) {
            if(num==1) {
                System.out.println("Day is : Monday");
            }
            else if(num==2) {
                System.out.println("Day is : Tuesday");
            }
            else if(num==3) {
                System.out.println("Day is : Wednesday");
            }
            else if(num==4) {
                System.out.println("Day is : Thursday");
            }
            else if(num==5) {
                System.out.println("Day is : Friday");
            }
            else if(num==6) {
                System.out.println("Day is : Saturday");
            }
            else {
                System.out.println("Day is : Sunday");
            }
        }
        else {
            System.out.println("Enter the valid Number");
        }
    }
}