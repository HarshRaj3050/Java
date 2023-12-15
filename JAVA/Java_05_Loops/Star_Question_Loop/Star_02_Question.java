/* Write a program to print the following pattern :
                *
               * *
              * * *
             * * * *                             */

package Java_05_Loops.Star_Question_Loop;
public class Star_02_Question {
    public static void main(String[] args) {
        int i=1;
        while(i<5) {
            for(int j=4; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
            i++;
        }
    }
}
