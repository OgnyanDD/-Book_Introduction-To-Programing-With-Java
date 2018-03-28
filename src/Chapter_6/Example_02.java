package Chapter_6;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        int num = 1;
        int sum = 1;
        System.out.print("The sum 1");
        while (num < n) {
            num++;
            sum += num;
            System.out.printf("+%d", num);
        }
        System.out.printf(" = %d%n", sum);
    }
}
/*
n = 17
The sum 1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17 = 153
 */