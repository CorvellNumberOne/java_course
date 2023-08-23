
package Lesson_29;

import java.time.*;

public class Test4 {
    static void smenaDejurnogo(LocalDate start, LocalDate end, Period p){
        LocalDate data = start;
        while(data.isBefore(end)){
            System.out.println("nastupila data "+data+". Pora menjat deszhurnogo");
            data = data.plus(p);
        }
    }
    
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2040, Month.MAY, 31);
        Period p = Period.of(1,3,4);
        Test4.smenaDejurnogo(nachalo, konec, p);
        
    }
}

