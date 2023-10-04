// Write a program to calculate CGPA using marks of three subjects (out of 100)

package Java_01_Basic;
import java.util.Scanner;
public class Basic_10_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------- Enter Three subject Marks -------");

        System.out.print("Enter First subject number : ");
        float sub1 = scan.nextInt();
        System.out.print("Enter Second subject number : ");
        float sub2 = scan.nextInt();
        System.out.print("Enter Third subject number : ");
        float sub3 = scan.nextInt();

        float allSub = sub1 + sub2 + sub3;
        float cgpa = allSub / 30;
        System.out.print("The CGPA of three subject is : ");
        System.out.println(cgpa);

    }
}
