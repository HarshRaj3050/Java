// Write a Java program to find whether an array is sorted or not.

package Java_06_Arrays;
import java.util.Scanner;
public class practice {
    static void sorted(int arr[]) {
        int num = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(num > arr[i]) {
                System.out.println("Array is not sorted");
                break;
            }
            else if(i+1 ==  arr.length) {
                System.out.println("Array is sorted");
            }
            num = arr[i];
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