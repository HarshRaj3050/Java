/* Write a program to calculate
    1/2! - 1/3! + 1/4! - 1/5! + 1/6! - 1/7! + ................ + 1/40!
*/

package College_Practical;
public class Practical_02 {
    public static void main(String[] args) {
        double numLimit = 40;
        double fact = 0;
        double result = 0;
        for(int i=0; i <= numLimit; i++) {
            if(i==0 || i==1) {
                fact = i;
            }
            else {
                fact = fact * i;
                if(i%2==0) {
                    result = result + fact;
                }
                else {
                    result = result - fact;
                }
            }
        }
        System.out.println("Factorial of this Patten is : " + result);
    }
}
