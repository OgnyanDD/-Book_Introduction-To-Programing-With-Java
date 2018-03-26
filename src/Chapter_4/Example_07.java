package Chapter_4;

import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);

        System.out.printf("f = ");
        float f = in.nextFloat();
        System.out.printf("%d * %d / %f = %f%n", a, b, f, a * b / f);
    }
}
/*
a = 5
b = 6
5 + 6 = 11
5 * 6 = 30
f = 7.5
5 * 6 / 7.500000 = 4.000000
 */