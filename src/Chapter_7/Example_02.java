package Chapter_7;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = in.nextInt();
        }
        boolean symmetric= true;
        for (int i = 0; i < (array.length + 1) / 2 ; i++) {
            if (array[i] != array[n - i - 1]) {
                symmetric = false;
            }
        }
        System.out.printf("Symmetric? %b%n", symmetric);
    }
}
/*
3
1
2
1
Symmetric? true
 */