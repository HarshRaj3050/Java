/*  Calculate the average marks from an array containing marks of all students
    in physics using a for-each loop. */

package Java_06_Arrays;
import java.util.Scanner;
public class Arrays_12_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User can Inter 5 Student marks (using for loop)
        int [] marks = new int[5];
        System.out.println("-----Enter Five Student Marks in Physics-----");
        for(int i=0; i<marks.length; i++) {
            System.out.print("Enter Your Marks : ");
            marks[i] = scan.nextInt();
        }
        // Calculate the Average marks of all students (using for-each loop)
        float sum = 0;
        for(float element : marks) {
            sum = sum + element;
        }
        float avg = sum*100 / 500;
        System.out.println("Average of Marks in Five Student is : " + avg);
    }
}
