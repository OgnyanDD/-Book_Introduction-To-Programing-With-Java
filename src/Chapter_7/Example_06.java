package Chapter_7;

public class Example_06 {
    public static void main(String[] args) {

        int [] array = new int[] {1, 2, 3, 4, 5};
        System.out.print("Reversed: ");
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
// Reversed: 5 4 3 2 1