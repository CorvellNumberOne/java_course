package Homework.Lesson_14;

public class Time {

    public static void counter() {

        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute / 10 == 0) {
                        break OUTER;
                }
                INNER:
                for (int sec = 0; sec <= 59; sec++) {
                    if (sec * hour > minute) {
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minute + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        counter();
    }
}
