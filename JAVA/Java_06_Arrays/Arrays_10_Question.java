// Create an array of 5 floats and calculate their sum.

package Java_06_Arrays;
public class Arrays_10_Question {
    public static void main(String[] args) {

        float [] arr = {34.5f, 52.4f, 23.6f, 15.6f, 63.2f};
        float sum = 0;
        for(float element : arr) {
            sum = sum + element;
        }
        System.out.println("Sum is : " + sum);
    }
}
