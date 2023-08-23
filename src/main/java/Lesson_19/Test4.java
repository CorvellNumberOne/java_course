
package Lesson_19;


public class Test4 {
    public static void main(String[] args) {
        int [] array = {0, 6, 4, 1};
        int summa = 0;
        for(int a: array){
            summa+=a;
        }
        System.out.println(summa);
        
    }
}

/* Принцип работы данного цикла 
    1. int a = 0; (Нулевому индексу массива, который содержит в себе значение 0)
    2. int summa = 0;
    3. summa = a (Равно нулю)
    4. Цикл повторяется
    5. int a = 6; (Равент второму индексу, котрый содержит цифру 6)
    6. приравниваем summa = a (Равен 6)
    7. Цикл повторяется



*/

