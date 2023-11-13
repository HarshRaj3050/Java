// Creating a method which receives an array as a parameter

package Java_06_Arrays;
public class Arrays_04_Code {
    public static void min(int arr[]) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min<arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int a [] = {33,3,5,6};
        // passing array to method
        min(a);
    }
}
