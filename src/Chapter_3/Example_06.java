package Chapter_3;

public class Example_06 {
    public static void main(String[] args) {
        int a = 6, b = 3, c = 3;

        System.out.println(c); // 3
        System.out.println((a + b) / 2); // 4
        String s = "Beer";
        System.out.println(s instanceof String); // true

        int d = 0;
        System.out.println(d); // 0
        System.out.println((a + b) / d); // ArithmeticException
    }
}
