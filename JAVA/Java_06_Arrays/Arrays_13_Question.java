// Create a Java program to add two matrices of size 2x3.

package Java_06_Arrays;
public class Arrays_13_Question {
    public static void main(String[] args) {
        int[][] mat1 = {{5, 3, 7}, {6, 4, 7}};
        int[][] mat2 = {{8, 2, 6}, {7, 4, 1}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        System.out.println("-----First Matrix-----");
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----Second Matrix-----");
        for(int i=0; i<mat2.length; i++){
            for(int j=0; j<mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----Add First and Second Matrix-----");
        for (int i=0; i< result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


