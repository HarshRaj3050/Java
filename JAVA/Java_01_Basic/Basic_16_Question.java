package Java_01_Basic;
import java.util.Scanner;
public class Basic_16_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String num = scan.next();
        String temp = num;
        int prvNum = 0;
        for(int i=0; i<num.length(); i++) {
            System.out.print(temp.charAt(i));
            if((int)temp.charAt(i) >= prvNum) {

            }
        }
    }
}
