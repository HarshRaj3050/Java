package Java_13_Multithreading;
class JoinMethod extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class Multithreading_07_Code {
    public static void main(String[] args) {
        JoinMethod t1 = new JoinMethod();
        JoinMethod t2 = new JoinMethod();
        JoinMethod t3 = new JoinMethod();
        System.out.println("---t1 process---");
        t1.start();
        try {
            t1.join();
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("---t2 and t3 process---");
        t2.start();
        t3.start();
    }
}
