package Chapter_5;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int biggerNumber = firstNumber;
        if (secondNumber > firstNumber) {
            biggerNumber = secondNumber;
        }
        System.out.printf("The bigger number is: %d%n", biggerNumber);
    }
}
/*
Enter two numbers.
5
6
The bigger number is: 6
 */