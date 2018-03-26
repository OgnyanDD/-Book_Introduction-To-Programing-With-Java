package Chapter_4;

import java.util.Calendar;
import java.util.Locale;

public class Example_03 {
    public static void main(String[] args) {

        long n = 120582;
        System.out.printf("%d%n", n);      // 120582
        System.out.printf("%08d%n", n);    // 00120582
        System.out.printf("%+8d%n", n);    //  +120582
        System.out.printf("%,8d%n", n);    //  120,582
        System.out.printf("%,8d%n%n", n);  //  120,582

        double pi = Math.PI;
        System.out.printf("%f%n", pi);                                // 3.141593
        System.out.printf("%.3f%n", pi);                              // 3.142
        System.out.printf("%10.3f%n", pi);                            //      3.142
        System.out.printf("%-10.3f%n", pi);                           // 3.142
        System.out.printf(Locale.ITALIAN,"%-10.4f%n%n", pi);    // 3,1416
        Calendar c = Calendar.getInstance();                          //
        System.out.printf("%tB %te, %tY%n", c, c, c);                 // March 26, 2018
        System.out.printf("%tl:%tM %tp%n", c, c, c);                  // 7:55 pm
    }
}
