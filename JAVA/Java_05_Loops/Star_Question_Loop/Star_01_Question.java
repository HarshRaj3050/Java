/* Write a program to print the following pattern :
        1
        22
        333
        4444
        55555                                     */

package Java_05_Loops.Star_Question_Loop;
public class Star_01_Question {
    public static void main(String[] args) {
        int i=1;
        while(i<=5) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
            i++;
        }
    }
}
