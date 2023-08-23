
package Lesson_29;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

//        LocalDate ld1 = LocalDate.of(2023, 5, 03);
//        System.out.println(ld1);
////      лайфхак
//        ld1 = ld1.minusWeeks(7);
//        System.out.println( ld1);

////      ------------------------------------------------------------
//        LocalTime lt1 = LocalTime.of(15, 30);
//        System.out.println(lt1);
//        lt1 = lt1.plusHours(1);
//        lt1 = lt1.plusMinutes(25);
//        System.out.println(lt1);
        
////      --------------------------------------------------------------
//      Вместо даты и врменеи можно подставлять переменные LocalTime и LocalDate
        LocalDateTime ldt1 = LocalDateTime.of(2023,8,4,17,25);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3);
        System.out.println(ldt1);

        
    }
}
