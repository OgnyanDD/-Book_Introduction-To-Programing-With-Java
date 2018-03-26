package Chapter_4;

import java.util.Date;

public class Example_02 {
    public static void main(String[] args) {
        System.out.printf("The time is: %1$tH:%1$tM:%1$tS. \n", new java.util.Date());
        // The time is: 19:42:55.
        Date date = new Date();
        System.out.printf("The date in Day/Month/Year is: %1$td/%1$tm/%1tY. \n", date );
        // The date in Day/Month/Year is: 26/03/2018.
        System.out.printf("The date and time are: %1$tA %1$tI:%1$tM%1$tp %1$tB/%1$tY. \n", date);
        // The date and time are: Monday 07:42pm March/2018.
    }
}
