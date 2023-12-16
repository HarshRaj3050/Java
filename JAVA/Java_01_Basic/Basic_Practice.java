/* Write a program to print the following pattern :
    *
   * *
  * * *
 * * * *                             */

package Java_01_Basic;
class Basic_Practice {
    public static void main(String[] args) {
        int row = 4;
        for(int i=1; i<=row; i++){
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            for(int l=1; l<=i; l++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}