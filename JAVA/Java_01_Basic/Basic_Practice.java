package Java_01_Basic;// Write a Java program to convert Kilometers to miles.

import java.util.Scanner;
class Basic_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----KILOMETERS  TO  MILES-----");
        System.out.print("Enter the Kilometers : ");
        double kilo = scan.nextFloat();
        double mile = kilo * 0.621371;
        System.out.println(kilo + " Kilometers is : " + mile + " Miles");
    }
}