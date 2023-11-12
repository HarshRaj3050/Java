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
        switch (num) {
            case 1: {
                System.out.println("Day is : Monday");
                break;
            }
            case 2: {
                System.out.println("Day is : Tuesday");
                break;
            }
            case 3: {
                System.out.println("Day is : Wednesday");
                break;
            }
            case 4: {
                System.out.println("Day is : Thursday");
                break;
            }
            case 5: {
                System.out.println("Day is : Friday");
                break;
            }
            case 6: {
                System.out.println("Day is : Saturday");
                break;
            }
            case 7: {
                System.out.println("Day is : Sunday");
                break;
            }
            default: {
                System.out.println("The Number is inValid");
            }
        }
    }
}