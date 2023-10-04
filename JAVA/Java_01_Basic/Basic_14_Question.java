/* Write a program to calculate the percentage of a given student in the CBSE board exam.
   His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100) */

package Java_01_Basic;
import java.util.Scanner;
class Basic_14_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Enter All the subject marks ( out of 100 )-----");
        System.out.print("Enter First subject marks : ");
        float sub1 = scan.nextInt();
        System.out.print("Enter Second subject marks : ");
        float sub2 = scan.nextInt();
        System.out.print("Enter Third subject marks : ");
        float sub3 = scan.nextInt();
        System.out.print("Enter Fourth subject marks : ");
        float sub4 = scan.nextInt();
        System.out.print("Enter Fifth subject marks : ");
        float sub5 = scan.nextInt();

        float average = ((sub1 + sub2 + sub3 + sub4 + sub5) * 100) / 500;
        System.out.println("The average marks is : " + average);
    }
}
