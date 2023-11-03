// Creating threads using the thread class

package Java_13_Multithreading;
class Multi extends Thread {
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}
public class Multithreading_01_Code {
    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.start();
    }
}
