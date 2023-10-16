// Write a program to find out whether a given integer is present in an array or not.

package Java_06_Arrays;
import java.util.Enumeration;
import java.util.Scanner;
public class practice {
     static void checkNumber(int [] number, int num) {
         boolean isPresent = false;
         for (int i : number) {
             if (num == i) {
                 isPresent = true;
                 break;
             }
         }
         if(isPresent) {
             System.out.println(num + " is Present in an Array");
         } else {
             System.out.println(num + " is not Present in an Array");
         }
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = {0,2,4,6,8,10};
        System.out.print("This integer is Present in an array : ");
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\nEnter the Number : ");
        int num = scan.nextInt();
        checkNumber(array, num);
        }
    }