/* Write a Java code for "Rock, Paper, Scissors" Game.
        0 = Rock
        1 = Paper
        2 = Scissors
 */

package Minor_Project;
import java.util.Scanner;
import java.util.Random;
public class Project_01_Code {
    static void umpire(int you, int computer) {
        if(you==0 || you==1 || you==2) {
            if(you == computer) {
                System.out.println("** Draw **");
            }
            else if (you==1&&computer==0 || you==2&&computer==1 || you==0&&computer==2) {
                System.out.println("**** You Win ****");
            }
            else {
                System.out.println("**** Computer Win ****");
            }
        } else {
            System.out.println("Not valid Number, Check Rules");
        }
    }
    static void computerInput(int num) {
        if(num == 0) {
            System.out.println("Computer Choice : Rock");
        } else if(num == 1) {
            System.out.println("Computer Choice : Paper");
        } else {
            System.out.println("Computer Choice : Scissors");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int computerNumber = random.nextInt(3);
        System.out.println("-------Rules-------\n" +
                           "0 = Rock\n" +
                           "1 = Paper\n" +
                           "2 = Scissors");
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        computerInput(computerNumber);
        umpire(num, computerNumber);
    }
}
