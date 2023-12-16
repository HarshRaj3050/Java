// Write a program to check if the given number is Armstrong or not.

package Java_01_Basic;
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
class Basic_Practice {
    public static void main(String[] args) {
        Patten p = new Patten(3);
        p.pattenOutput();
    }

}