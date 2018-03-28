package Chapter_6;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter positive number: ");

        int num = in.nextInt();
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        boolean prime = true;

        while (prime && (divider <= maxDivider)) {
            if (num % divider == 0) {
                prime = false;
            }
            divider++;
        }
        System.out.println("Prime? " + prime);
    }
}
/*
Enter positive number: 37
Prime? true
 */