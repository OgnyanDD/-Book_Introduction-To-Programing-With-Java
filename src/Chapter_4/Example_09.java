package Chapter_4;

import java.util.Scanner;

public class Example_09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("This program calculates " + "the area of a rectangle or a triangle");

        System.out.println("Enter a and b (for rectangle) " + "or a and h (for triangle): ");

        int a = in.nextInt(), b = in.nextInt();

        System.out.println("Enter 1 for a rectangle or " + "2 for a triangle: ");

        int choice = in.nextInt();
        double area = (double) (a * b) / choice;
        System.out.println("The area of your figure is " + area);
    }
}
/*
This program calculates the area of a rectangle or a triangle
Enter a and b (for rectangle) or a and h (for triangle):
5
4
Enter 1 for a rectangle or 2 for a triangle:
2
The area of your figure is 10.0
 */