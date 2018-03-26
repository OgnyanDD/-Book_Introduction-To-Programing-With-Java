package Chapter_4;

import java.util.Date;
import java.util.Locale;

public class Example_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Locale: " + Locale.getDefault().toString());
        System.out.printf("%.2f\n", 1234.56);
        System.out.printf("%1$tA %1$tI:%1tM%1$tp %1$tB-%1$tY.\n\n", new Date());

        Locale.setDefault(new Locale("bg", "BG"));
        System.out.println("Locale: " + Locale.getDefault().toString());
        System.out.printf("%.2f\n", 1234.56);
        System.out.printf("%1tA %1$tH:%1$tM %1$tB-%1$tY.\n", new Date());
    }
}
/*
Locale: en_US
1234.56
Monday 08:07pm March-2018.

Locale: bg_BG
1234,56
понеделник 20:07 март-2018.
 */
