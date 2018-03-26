package Chapter_4;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = in.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = in.nextLine();

        System.out.printf("Hello, %s %s!\n", firstName, lastName);
    }
}
/*
Please enter your first name:
Ognyan
Please enter your last name:
Dimitrov
Hello, Ognyan Dimitrov!
 */