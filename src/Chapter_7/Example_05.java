package Chapter_7;

import java.util.Arrays;

public class Example_05 {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};
        for (int index = 0; index < array.length ; index++) {
            array [index] = 2 * array [index];
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
[2, 4, 6, 8, 10]
 */