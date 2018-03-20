package Chapter_3;

public class Example_00 {
    public static void main(String[] args) {
        int squarePerimeter = 17;
        double squareSide = squarePerimeter / 4.0;
        double squareArea = squareSide * squareSide;
        System.out.println(squareSide); // 4.25
        System.out.println(squareArea); // 18.0625

        int a = 5;
        int b = 4;
        System.out.println(a + b); // 9
        System.out.println(a + b++); // 9
        System.out.println(a + b); // 10
        System.out.println(a + (++b)); // 11
        System.out.println(a + b); // 11
        System.out.println(14 / a); // 2
        System.out.println(14 % a); // 4
    }
}
