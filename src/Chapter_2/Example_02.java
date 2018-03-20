package Chapter_2;

public class Example_02 {
    public static void main(String[] args) {
        // Declare some variables
        float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        float num = 1.0f;
        // Is sum equal to num
        boolean equal = (num == sum);
        // Print the result on the console
        System.out.println("num = " + num + " sum = " + sum + " equal = " + equal);
    }
}
// Output: num = 1.0 sum = 1.0000001 equal = false