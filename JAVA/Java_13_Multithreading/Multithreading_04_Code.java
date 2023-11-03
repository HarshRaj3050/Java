// Using the Thread Class: Thread(String Name)

package Java_13_Multithreading;
class Thr extends Thread {
    Thr(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
public class Multithreading_04_Code {
    public static void main(String argvs[])
    {
        Thr t = new Thr("My first thread");
        t.start();
// getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}
