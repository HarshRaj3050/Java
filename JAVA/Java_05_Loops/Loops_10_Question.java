/* Write a program to print the following pattern :
         ****
         ***
         **
         *                                        */

package Java_05_Loops;
public class Loops_10_Question {
    public static void main(String[] args) {
        int i = 4;
        while(i>0) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            i--;
        }
    }
}
