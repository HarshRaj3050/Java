package Java_06_Arrays;

public class practice {
    public static void main(String[] args) {
        int[][] mat1 = {{5, 3, 7}, {6, 4, 7}};
        int[][] mat2 = {{8, 2, 6}, {7, 4, 1}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) { // Fix the inner loop here
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}

