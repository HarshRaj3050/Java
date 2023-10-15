/* Write a program using Recursion to print the following pattern:
            *
            **
            ***
            ****
 */

package Java_07_Method;
public class Method_16_Question {
    static void star(int n) {
        if(n>0) {
            star(n-1);
            for(int i=0; i<n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("-----This Pattern Print using Recursion-----");
        star(4);
    }
}
