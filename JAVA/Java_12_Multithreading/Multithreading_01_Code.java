// Java Thread Example by extending Thread class

package Java_12_Multithreading;
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
