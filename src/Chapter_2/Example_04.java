package Chapter_2;

public class Example_04 {
    public static void main(String[] args) {
        // Declare a variable
        char symbol = 'a';
        // Print the result of the console
        System.out.println("The code of '" + symbol + "' is: " + (int) symbol);
        symbol = 'b';
        System.out.println("The code of '" + symbol + "' is: " + (int) symbol);
        symbol = 'A';
        System.out.println("The code of '" + symbol + "' is: " + (int) symbol);
    }
}
/* Output:
The code of 'a' is: 97
The code of 'b' is: 98
The code of 'A' is: 65
*/