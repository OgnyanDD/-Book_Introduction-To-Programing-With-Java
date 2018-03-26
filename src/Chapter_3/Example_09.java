package Chapter_3;

public class Example_09 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        String s = "Sum=" + (a + b);
        System.out.println(s);

        String incorrect = "Sum=" + a + b;
        System.out.println(incorrect);

        System.out.println("Perimeter = " + 2 * (a + b) + ", Area = " + (a * b) + ".");
    }
}
/*
Sum=12
Sum=57
Perimeter = 24, Area = 35.
 */