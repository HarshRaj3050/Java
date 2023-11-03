// Write a code to Using Runnable interface

package Java_13_Multithreading;
class X implements Runnable {                                          // Step 1
    @Override
    public void run(){                                                 // Step 2
        for(int i=1; i<=5; i++) {
            System.out.println("\tThread X : " + i);
        }
        System.out.println("End of Thread X");
    }
}
public class Multithreading_03_Code {
    public static void main(String[] args) {
        X runnable = new X();                                          // Step 3
        Thread threadX = new Thread(runnable);                         // Step 4
        threadX.start();                                               // Step 5
        System.out.println("End of main Thread");
    }
}
