// Write a function to convert Celsius temperature into Fahrenheit.

package Java_07_Method;
import java.util.Scanner;
public class Method_12_Question {

    static float CelsiusToFahrenheit(float celsius) {
        return celsius * (9.0f/5.0f) + 32.0f;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celsius Temperature : ");
        float celsius = scan.nextFloat();
        float Fahrenheit = CelsiusToFahrenheit(celsius);
        System.out.println(celsius + " CELSIUS is : " + Fahrenheit + " FAHRENHEIT");
    }
}
