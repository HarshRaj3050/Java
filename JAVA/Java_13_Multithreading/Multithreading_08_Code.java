// Example of the sleep() Method in Java : on the main thread

package Java_13_Multithreading;
public class Multithreading_08_Code {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(i);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
