/* Write a program to print the following pattern :
          2
         242
        24842                                       */

package Java_05_Loops.Star_Question_Loop;
class Patten {
    int row;
    Patten(int row) {
        this.row = row;
    }
    public void pattenOutput() {
        int max=1;
        for (int i = 1; i <= row; i++) {
            for(int k = 3; k>=i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                int value = (int) Math.pow(2, j);
                System.out.print(value);
                max = value;
            }
            while(max > 2) {
                int value = max / 2;
                System.out.print(value);
                max = max / 2;
            }
            System.out.println();
        }
    }
}
public class Star_04_Question {
    public static void main(String[] args) {
        Patten p = new Patten(3);
        p.pattenOutput();
    }
}


