package Chapter_3;

public class Example_08 {
    public static void main(String[] args) {
        double myDouble = 5.1d;
        System.out.println(myDouble); // 5.1

        long myLong = (long)myDouble;
        System.out.println(myLong); // 5

        myDouble = 5e9d; // 5 * 10^9
        System.out.println(myDouble); // 5.0E9

        int myInt = (int) myDouble;
        System.out.println(myInt); // 2147483647
        System.out.println(Integer.MAX_VALUE); // 2147483647
    }
}
