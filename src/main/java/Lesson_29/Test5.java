
package Lesson_29;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1,16,40);
        LocalTime lt = LocalTime.of(10, 30);
//        Period p = Period.ofDays(10);
        Period p = Period.ofMonths(10);
//        p = Period.ofDays(4);
//      ----------------------------------------------
        Duration d = Duration.ofMinutes(30);

        System.out.println(ldt.plus(d).plus(p));
    }
}
