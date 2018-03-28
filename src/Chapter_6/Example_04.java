package Chapter_6;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long factorial = 1;
        while (true) {
            if (n == 1) {
                break;
            }
            factorial *= n;
            n--;
        }
        System.out.println("n! = " + factorial);
    }
}
/*
10
n! = 3628800
 */