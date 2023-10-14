// Write a function to find the average of a set of numbers passed as arguments.

package Java_07_Method;
public class Method_14_Question {
    static float average(float... num) {
        float avg;
        float sum = 0.f;
        for (float i : num) {
            sum = sum + i;
        }
        avg = sum / num.length;
        return avg;
    }
    public static void main(String[] args) {
        float first = average(5, 10, 15);
        System.out.println("Average of First set of Number is : " + first);
        float second = average(3, 6, 9, 12);
        System.out.println("Average of Second set of Number is : " + second);
        float third = average(4, 8, 12, 16, 20);
        System.out.println("Average of Third set of Number is : " + third);

    }
}
