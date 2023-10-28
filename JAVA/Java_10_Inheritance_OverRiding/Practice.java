/* ------- A real example of Java Method Overriding --------
   Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
   However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks
   could provide 8%, 7%, and 9% rate of interest.
*/

package Java_10_Inheritance_OverRiding;
interface Bank1 {
    int rateOfInterest();
}
class SBI1 implements Bank1 {
    @Override
    public int rateOfInterest() {
        return 8;
    }
}
class ICICI1 implements Bank1 {
    @Override
    public int rateOfInterest() {
        return 7;
    }
}
class AXIS1 implements Bank1 {
    @Override
    public int rateOfInterest() {
        return 9;
    }
}
public class Practice {
    public static void main(String[] args) {
        SBI1 sbi = new SBI1();
        ICICI1 icici = new ICICI1();
        AXIS1 axis = new AXIS1();
        System.out.println("Rate of Interest in SBI : " + sbi.rateOfInterest() + "%");
        System.out.println("Rate of Interest in ICICI : " + icici.rateOfInterest() + "%");
        System.out.println("Rate of Interest in AXIS : " + axis.rateOfInterest() + "%");
    }
}