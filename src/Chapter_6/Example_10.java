package Chapter_6;

import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        System.out.print("m = ");
        int m = in.nextInt();

        for (int num = n; num <= m ; num++) {
            boolean prime = true;
            int divider = 2;
            int maxDivider = (int) Math.sqrt(num);
            while (divider <= maxDivider) {
                if (num % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }
            if (prime) {
                System.out.printf("%d ", num);
            }
        }
    }
}
/*
n = 3
m = 75
3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73
 */