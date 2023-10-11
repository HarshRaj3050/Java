// Write a program to find out whether a given integer is present in an array or not.

package Java_06_Arrays;
import java.util.Scanner;
public class Arrays_11_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Display the Integer is present in an Arrays
        System.out.print("Integer is Present in an Array : ");
        int [] array = {0, 2, 4, 6, 8, 10};
        for(int element : array) {
            System.out.print(element + " ");
        }
        // User input number to check Number is present or not
        System.out.print("\nEnter Your Number to check Number is present or not : ");
        int num = scan.nextInt();

        // Check One by One Array Index
        boolean isInArray = false;
        for (int i : array) {
            if (i == num) {
                isInArray = true;
                break;
            }
        }
        // Display if Integer is Present in an Array or Not Present
        if(isInArray) {
            System.out.println("The Integer is Present in an Array");
        }
        else {
            System.out.println("The Integer is Not Present in an Array");
        }
    }
}
