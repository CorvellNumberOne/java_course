
package Lesson_14;


public class Test4 {
    public static void main(String[] args) {
        int a=15;
//      В данном случае цикл for и его условие относятся к if
        if (a>10)
            for (int i=1; i<=10; i++)
                System.out.println(i);
//      Данный statement уже не относится к if. Что бі он относился к if его
//      его нужно обернуть в фигурные скобки
        System.out.println("Привет");
            
        
    }
    
}
