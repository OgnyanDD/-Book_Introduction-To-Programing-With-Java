package Chapter_4;

import java.util.Scanner;

public class Example_08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter person name: ");
        String person = in.nextLine();
        System.out.printf("Enter book name: ");
        String book = in.nextLine();

        String from = "Authors Team";

        System.out.printf("  Dear %s,%n", person);
        System.out.printf("We are pleased to inform " + "you that \"%2$s\" is the best Bulgarian book. \n" +
                          "The authors of the book wish you good luck %s!%n", person, book);

        System.out.println("  Yours, ");
        System.out.printf("  %s", from);
    }
}
/*
Enter person name: Readers
Enter book name: Introduction to Programming with Java
  Dear Readers,
We are pleased to inform you that "Introduction to Programming with Java" is the best Bulgarian book.
The authors of the book wish you good luck Readers!
  Yours,
  Authors Team
 */