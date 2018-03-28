package Chapter_6;

import java.util.Scanner;

public class Example_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
/*
7
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */