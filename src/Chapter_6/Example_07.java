package Chapter_6;

import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            if (i % 7 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
/*
26
sum = 141
 */