// Example of java interface which provides the implementation of Bank interface.

package Java_11_Abstract_Interface;
interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}
class PNB implements Bank{
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}
public class Interface_02_Code {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI : " + b.rateOfInterest());
    }
}
