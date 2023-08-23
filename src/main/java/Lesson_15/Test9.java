package Lesson_15;

public class Test9 {

    public static void main(String[] args) {
//      Вывод на экран времени с помощью do while 

        int chas = 0; // Инициализация переменной час
        
        OUTER:
        do {
            int minuta = 0; // Инициализация переменной минута
            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;

        } while (chas < 24);
        

    }
}
