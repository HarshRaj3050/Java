/* Calculate income tax paid by an employee to the government as per the slabs mentioned below:
             Income Slab	Tax
             5.0L – 7.5L  	5%
             7.5L – 10.0L 	10%
             10.0L - 12.5L	15%
             12.5L - 15.0L  20%
             15.0 - above   30%
    Note that there is not tax below 5.0L. Take the input amount as input from the user. */

package Java_04_Condition;
import java.util.Scanner;
public class Condition_12_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your annual Income : ");
        float income = scan.nextFloat();

        float tax = 0;
        if (income <= 500000) {
            tax = tax + 0;
        }
        else if (income > 500000 && income <= 750000) {
            tax = (income - 500000) * 0.05f;
        }
        else if (income > 750000 && income <= 1000000) {
            tax = (500000 - 250000) * 0.05f;
            tax = tax + ((income - 750000) * 0.1f);
        }
        else if (income > 1000000 && income <= 1250000) {
            tax = (500000 - 250000) * 0.05f;
            tax = tax + (1000000 - 750000) * 0.1f;
            tax = tax + (income - 750000) * 0.15f;
        }
        else if (income > 1250000 && income <= 1500000) {
            tax = (500000 - 250000) * 0.05f;
            tax = tax + (1000000 - 750000) * 0.1f;
            tax = tax + (1250000 - 1000000) * 0.15f;
            tax = tax + (income - 1250000) * 0.2f;
        }
        else {
            tax = (500000 - 250000) * 0.05f;
            tax = tax + (1000000 - 750000) * 0.1f;
            tax = tax + (1250000 - 1000000) * 0.15f;
            tax = tax + (1500000 - 1250000) * 0.2f;
            tax = tax + (income - 1500000) * 0.3f;
        }
        System.out.println("Your Tax is : " + tax);

    }
}
