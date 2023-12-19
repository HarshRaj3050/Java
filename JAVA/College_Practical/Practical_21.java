package College_Practical;
import java.util.Scanner;

public class Practical_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the coefficient a : ");
        double a = scan.nextDouble();
        System.out.print("Enter the coefficient b : ");
        double b = scan.nextDouble();
        System.out.print("Enter the coefficient c : ");
        double c = scan.nextDouble();

        double discriminant = (b * b) - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("The roots are real and discriminate");
        }
        else if (discriminant == 0) {
            System.out.println("The roots are real and Equal");
        }
        else {
            System.out.println("The roots are not-real");
        }
        double eq1 = (-b)/(2*a);
        double eq2 = (Math.sqrt(discriminant))/(2*a);
        double x1 = eq1 + eq2;
        double x2 = eq1 - eq2;
        System.out.println("The value of x is " + x1 + " and " + x2);
    }
}

