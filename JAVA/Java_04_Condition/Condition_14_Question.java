/*  Write a Java program to find out the day of the week given the number
    [1 for Monday, 2 for Tuesday … and so on!]  */

package Java_04_Condition;
import java.util.Scanner;
public class Condition_14_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                ---- 1 for Monday ----
                ---- 2 for Tuesday ----
                ---- 3 for Wednesday ----
                ---- 4 for Thursday ----
                ---- 5 for Friday ----
                ---- 6 for Saturday ----
                ---- 7 for Sunday ----
                """);

        System.out.print("Enter the Number : ");
        int day = scan.nextInt();
        switch (day) {
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
                System.out.println("Wrong Number, Enter valid number");
            }
        }

    }
}
