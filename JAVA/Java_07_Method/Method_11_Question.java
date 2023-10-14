/* Write a program using functions to print the following example pattern (User can enter LINE).
             *
            ***
           *****
          *******
 */

package Java_07_Method;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Method_11_Question {

    static void star(int line) {
        int space = line-1;
        int starNum = 1;
        for(int i=0; i<line; i++) {
            for(int j=space; j>=0; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<starNum; k++) {
                System.out.print("*");
            }
            starNum = starNum + 2;
            space = space - 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Line in the Patten : ");
        int line = scan.nextInt();
        star(line);
    }
}
