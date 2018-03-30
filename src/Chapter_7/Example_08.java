package Chapter_7;

public class Example_08 {
    public static void main(String[] args) {

        int [][] matrix = {
                {1, 2, 3, 4 },
                {5, 6, 7, 8 },
        };
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4
5 6 7 8
 */