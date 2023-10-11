// Write a Java program to reverse an array.

package Java_06_Arrays;
public class Arrays_14_Question {
    public static void main(String[] args) {
        int [] array = {3, 6, 7, 4, 8};
        System.out.println("-----Not reverse order-----");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n-----reverse order-----");
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
