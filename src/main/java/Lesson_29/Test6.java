
package Lesson_29;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2023, Month.AUGUST, 6);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1,16,40);
        LocalTime lt = LocalTime.of(16, 40);
        DateTimeFormatter d5 = DateTimeFormatter.ofPattern("MM dd yyyy");
        
//      ------------------------------------------------------------------------
        
        LocalDate date1 = LocalDate.parse("01 02 2015", d5);
        LocalDate date2 = LocalDate.parse("01 02 2015", d5);
        System.out.println(date1);
        
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;


//        System.out.println(ldt);
//        System.out.println(ldt.format(d5));
//        
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//        
//        System.out.println(lt);
//        System.out.println(lt.format(d2));
//        
//        System.out.println(ldt);
//        System.out.println(ldt.format(d3));
//
//        System.out.println(ld);
//        System.out.println(ld.format(d4));

//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));
//        System.out.println(ldt);
//        System.out.println(ldt.format(shortFormat));
    }
}
