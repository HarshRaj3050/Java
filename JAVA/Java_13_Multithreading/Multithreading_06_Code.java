// Java Program to Illustrate Priorities in Multithreading
// via help of getPriority() and setPriority() method

package Java_13_Multithreading;
class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Inside the run() method");
    }
}
public class Multithreading_06_Code {
    public static void main(String[] args) {
        ThreadPriority th1 = new ThreadPriority();
        ThreadPriority th2 = new ThreadPriority();
        ThreadPriority th3 = new ThreadPriority();
        System.out.println("------Before Set Priority (default is 5)------");
        System.out.println("First Thread Priority : " + th1.getPriority());
        System.out.println("Second Thread Priority : " + th2.getPriority());
        System.out.println("Third Thread Priority : " + th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(9);
        th3.setPriority(3);
        System.out.println("\n------After set Priority------");
        System.out.println("First Thread Priority : " + th1.getPriority());
        System.out.println("Second Thread Priority : " + th2.getPriority());
        System.out.println("Third Thread Priority : " + th3.getPriority());

        System.out.println("\n------Main Thread------");
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }
}