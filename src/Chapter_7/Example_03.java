package Chapter_7;

public class Example_03 {
    public static void main(String[] args) {

        String [] array = {"one", "two", "three", "four"};
        for (int index = 0; index < array.length; index++) {
            System.out.printf("element[%d] = %s%n", index, array[index]);
        }
    }
}
/*
element[0] = one
element[1] = two
element[2] = three
element[3] = four
 */