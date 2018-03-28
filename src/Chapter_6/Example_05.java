package Chapter_6;

import java.util.Scanner;

public class Example_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int num = n;
        long product = 1;

        do {
            product *= num;
            num++;
        } while (num <= m);
        System.out.println("product [n...m] = " + product );
    }
}
/*
2
6
product [n...m] = 720
 */