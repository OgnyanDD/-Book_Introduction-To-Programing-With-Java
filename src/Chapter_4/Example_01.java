package Chapter_4;

public class Example_01 {
    public static void main(String[] args) {
        String name = "Boris";
        int age = 18;
        String town = "Plovdiv";

        System.out.printf("My name is %s.\n", name);
        // Output: My name is Boris.
        System.out.printf("My name is %S. \n", name);
        System.out.printf("My name is %s.\n", name);
        // Output: My name is BORIS.
        System.out.printf("%1$s is big town. \n" + "%2$s lives in %1$s. \n" + "%2$s is %3$d years old. \n", town, name, age);
        /*
        Output:
        Plovdiv is big town.
        Boris lives in Plovdiv.
        Boris is 18 years old.
         */
        int a = 2, b = 3;
        System.out.printf("%d + %d =", a, b);
        System.out.printf(" %d\n", (a + b));
        //Output: 2 + 3 = 5
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        // Output: 2 * 3 = 6
        float pi = 3.14159206f;
        System.out.printf("%.2f%n", pi);
        // Output: 3.14
        System.out.printf("%.5f%n", pi);
        // Output: 3.14159

        double colaPrice = 1.20;
        String cola = "Coca Cola";
        double fantaPrice = 1.20;
        String fanta = "Fanta Bamboocha";
        double kamenitzaPrice = 1.50;
        String kamenitza = "Kamenitza";

        System.out.println("\nMenu:");
        System.out.printf("1. %s - %.2f%n", cola, colaPrice);
        System.out.printf("2. %s - %.2f%n", fanta, fantaPrice);
        System.out.printf("3. %s - %.2f%n", kamenitza, kamenitzaPrice);
        System.out.println();
        /* Output:
        Menu:
        1. Coca Cola - 1.20
        2. Fanta Bamboocha - 1.20
        3. Kamenitza - 1.50
         */
        System.out.println("Next sentence will be" + " on a new line.");
        System.out.printf("Bye, bye %s from %s.%n", name, town);
        /* Output:
        Next sentence will be on a new line.
        Bye, bye Boris from Plovdiv.
         */
    }
}
