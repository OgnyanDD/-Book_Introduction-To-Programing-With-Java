package Chapter_6;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        System.out.print("m = ");
        int m = in.nextInt();
        long result = 1;
        for (int i = 0; i < m ; i++) {
            result *= n;
        }
        System.out.println("n^m = " + result);
    }
}
/*
n = 2
m = 10
n^m = 1024
 */