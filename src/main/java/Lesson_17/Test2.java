
package Lesson_17;


public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50); // Вместимость: 50 символов 
        StringBuilder sb4 = new StringBuilder(sb2);
        
//      Метод insert позволяет вставить на определенній индекс какое-то значение
        System.out.println(sb2.insert(sb2.length(), "hello"));
        System.out.println(sb2.length());
        
        StringBuilder sb10 = new StringBuilder("Hello world");
        
//      Удаляет все начиная с 5 до 11 индекса
//        sb10.delete(5, 11);
//        System.out.println(sb10);

//      Удаляет символ согласно его индексу
//        sb10.deleteCharAt(6);
//        System.out.println(sb10);
        
//      Переворачивает StringBuilder с конца в начало
        sb10.reverse();
        System.out.println(sb10);
        
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        
//      Заменяет стрингом символі, от и до в аргументе
        sb12.replace(0, 5, "Vase ");
        System.out.println(sb12);
    }
}
