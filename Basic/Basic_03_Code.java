// Write a JAVA code Add any two number. ( User can inter number )

import java.util.Scanner;
public class Basic_03_Code {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("The sum is : ");
        System.out.println(sum);
    }
}
