package Chapter_5;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two numbers (on separate lines).");

        int first = in.nextInt();
        int second = in.nextInt();

        if (first == second) {
            System.out.println("The first number is greater.");
        } else {
            System.out.println("The second number is greater.");
        }
    }
}
/*
Please enter two numbers (on separate lines).
2
4
The second number is greater.
 */