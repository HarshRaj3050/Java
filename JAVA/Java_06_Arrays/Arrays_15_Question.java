// write a Java program to find the maximum element in an array.

package Java_06_Arrays;
public class Arrays_15_Question {
    public static void main(String[] args) {
        int [] array = {34, 46, 23, 65, 13, 54};
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Maximum element in an array is : " + max);
    }
}
