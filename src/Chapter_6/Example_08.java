package Chapter_6;

public class Example_08 {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        String[] towns = {"Sofia", "Plovdiv", "Varna", "Bourgas"};
        for (String town: towns) {
            System.out.printf("%s ", town);
        }
    }
}
/*
2 3 5 7 11 13 17 19
Sofia Plovdiv Varna Bourgas
 */