package Java_13_Multithreading;
class th2 extends Thread {
    public void run() {
        System.out.println("Hello");
        System.out.println("I am Harsh");
    }
}
public class Practice {
    public static void main(String[] args) {
        th2 t1 = new th2();
        th2 t2 = new th2();
        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
