// Write a Java program to find whether an array is sorted or not.

package Java_06_Arrays;
import java.util.Scanner;
public class practice {
    static void sorted(int arr[]) {
        int prevNum = arr[0];
        boolean check = true;
        for(int i=0; i<arr.length; i++) {
           if(arr[i] < prevNum) {
               check = false;
               break;
           }
           else {
               prevNum = arr[i];
           }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[5];
        int j = 0;
        for(int i=1; i<=arr.length; i++) {
            System.out.print(i + ". Enter the number : ");
            arr[j] = scan.nextInt();
            j++;
        }
        sorted(arr);
    }
}