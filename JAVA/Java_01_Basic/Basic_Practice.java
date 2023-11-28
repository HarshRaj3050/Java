// Write a program to calculate CGPA using marks of three subjects (out of 100)

package Java_01_Basic;
import java.util.Scanner;
class Basic_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First subject Marks : ");
        float sub1 = scan.nextInt();
        System.out.print("Enter Second subject Marks : ");
        float sub2 = scan.nextInt();
        System.out.print("Enter Third subject Marks : ");
        float sub3 = scan.nextInt();

        float CGPA = (sub1 + sub2 + sub3) / 30.f;
        System.out.println("CGPA : " + CGPA);
    }
}