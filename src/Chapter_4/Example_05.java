package Chapter_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_05 {
    public static void main(String[] args) throws IOException {

        // Open the standard input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your first name: ");
        String firstName = br.readLine();

        System.out.println("Please enter your last name: ");
        String lastName = br.readLine();

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