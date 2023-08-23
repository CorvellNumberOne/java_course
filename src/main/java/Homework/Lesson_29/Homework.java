
package Homework.Lesson_29;

import java.time.*;
import java.time.format.*;

public class Homework {
    public static void main(String[] args) {
//      ------------------------------------------------------------------------  
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.FEBRUARY, 3, 9, 0);
        Duration d = Duration.ofMinutes(30);
        Period p = Period.ofDays(10);
//      ------------------------------------------------------------------------        
        First f  = new First();
        f.smena(ldt1, ldt2, p, d);
    }
}

class First {
    
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, yyyy, dd/MMM/yy");
    
    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d){
        
        while (ldt1.isBefore(ldt2)){
            System.out.println("Rabotaem s: " + ldt1.format(d1));
            System.out.println("Do: "+ldt1.plus(p).format(d1));
            System.out.println("Otdyhaem s: "+ldt1.format(d2));
            System.out.println("Do: " + ldt1.plus(d).format(d2));
            ldt1=ldt1.plus(d);
            ldt1=ldt1.plus(p);
        }

        
//        if (ldt1.isBefore(ldt2)){
//            
//        }
    }
}