// A simple program to Test Interface default

package Java_11_Abstract_Interface;
interface TestInterface
{
    public void square(int a);  // abstract method

    default void show() {  // default method
        System.out.println("Default Method Executed");
    }
}
class TestClass implements TestInterface {
    // implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }
}

    public class Interface_03_Code {
    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.square(4);
        // default method executed
        d.show();
    }
}


