
package Lesson_29;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2023, 5, 03);
        LocalDate ld2 = LocalDate.of(2029, Month.APRIL, 07);
        System.out.println(ld1.isAfter(ld2));
        
        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(23, 30, 36,99999);
        System.out.println(lt1.isBefore(lt2));
        
        LocalDateTime ldt1 = LocalDateTime.of(2023,8,4,17,25);
        LocalDateTime ldt2 = LocalDateTime.of(2023,8,4,17,25, 9);
    }
}
