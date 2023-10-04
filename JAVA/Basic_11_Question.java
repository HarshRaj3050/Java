/* Write a Java program that asks the user to enter his/her name and greets
   them with “Hello <name>, have a good day” text. */

import javax.naming.Name;
import java.util.Scanner;
public class Basic_11_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your name : ");
        String name = scan.next(); // For Single word
        // String name = scan.nextLine(); // For Multiple words
        System.out.println("Hello " + name + ", have a good day");
    }
}
