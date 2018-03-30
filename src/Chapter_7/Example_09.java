package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Example_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix [row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
/*
3
2
matrix[0,0] = 6
matrix[0,1] = 8
matrix[1,0] = 4
matrix[1,1] = 5
matrix[2,0] = 3
matrix[2,1] = 9
[[6, 8], [4, 5], [3, 9]]
 */