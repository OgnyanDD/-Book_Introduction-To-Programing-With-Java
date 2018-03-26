package Chapter_3;

public class Example_04 {
    public static void main(String[] args) {
        int x = 6, y = 4;
        System.out.println(y *= 2); // 8
        int z = y = 3; // y = 3 and z = 3

        System.out.println(z); // 3
        System.out.println(x |= 1); // 7
        System.out.println(x += 3); // 10
        System.out.println(x / 2); // 5
    }
}
