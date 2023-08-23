
package Homework.Lesson_15;


public class Timev2 {
    
    public static void time(){
        int hour=0;
        OUTER:
        while(hour<24){
            int minute=0;
            MIDDLE:
            do {
                int sec=0;
                
                INNER:
                while(sec<60){
                    System.out.println(hour + ":"+minute+":"+sec);
                    sec++;
                }
                minute++;
            }
            while(minute<60);
            hour++;
        }
    }
    public static void main(String[] args) {
        Timev2.time();
    }
}
