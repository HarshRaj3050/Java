// Write a Java program to find whether an array is sorted or not.

package Java_06_Arrays;
import java.util.Scanner;
public class Java_16_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Enter Five Number (try to Enter Number in sorted form---");
        int [] array = new int[5];
        // User can Enter 5 Integer value
        for(int i=0; i<array.length; i++) {
            System.out.print("Enter the Number : ");
            array[i] = scan.nextInt();
        }

        int prevArray = Integer.MIN_VALUE;
        boolean check = true;
        // Check the array One-by-One (Left-to-Right)
        for (int i : array) {
            if (prevArray > i) {
                check = false;
                break;
            }
            prevArray = i;
        }

        if(check) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }
}
