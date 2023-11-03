// Calling run() directly from main.

package Java_13_Multithreading;
class A extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("\tFrom Thread B : i = " + i);
        }
        System.out.println("Exit from B");
    }
}
public class Multithreading_02_Code {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
