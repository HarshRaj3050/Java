/* Write a program to print the following pattern :
        A
        BA
        CBA
        DCBA
        EDCBA                                     */

package Java_05_Loops.Star_Question_Loop;

public class Star_03_Question {
    public static void main(String[] args) {
        int i=2;
        int j=65;
        int k=65;
        while(i<=6) {
            while(j<=k) {
                System.out.printf("%c", k);
                k--;
            }
            k = k+i;
            System.out.println();
            i++;
        }
    }
}
