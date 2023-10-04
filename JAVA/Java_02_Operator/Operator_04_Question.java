/*   Find the value of 'a' in expression given below :
     int x = 7
     int a = x*49/x + 35/x
 */

package Java_02_Operator;
public class Operator_04_Question {
    public static void main(String[] args) {
        int x = 7;
        int a = x*49/x + 35/x;
        System.out.println("value of a is : " + a);
    }
}
