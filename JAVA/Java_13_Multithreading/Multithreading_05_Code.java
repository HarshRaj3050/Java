// Using the Thread Class: Thread(Runnable r, String name)

package Java_13_Multithreading;
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is Running....");
    }
}
public class Multithreading_05_Code {
    public static void main(String[] args) {
// creating an object of the class MyThread
        Runnable r1 = new MyThread();
// creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "First");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
