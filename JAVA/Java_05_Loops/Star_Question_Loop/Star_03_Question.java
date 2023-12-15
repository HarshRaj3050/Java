/* Write a program to print the following pattern :
        A
        BA
        CBA
        DCBA
        EDCBA                                     */

package Java_05_Loops.Star_Question_Loop;
public class Star_03_Question {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            for (int j = i; j >= 0; j--) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
    }
}
