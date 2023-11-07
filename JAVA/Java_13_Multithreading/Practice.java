// Example of the sleep() Method in Java : on the main thread

package Java_13_Multithreading;
class Sleep extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        Sleep sl = new Sleep();
        sl.start();
    }
}
