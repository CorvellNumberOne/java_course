
package Lesson_16;


public class Test1_1 {
    public static void main(String[] args) {
        String s1 = new String("Privet");
        
//      Позволяет нам присвоить переменной s10 часть строки начиная 
//      с заданного индекса
        String s10 = s1.substring(3);
        System.out.println(s10);
        
//      Убирает все пробелы до и после string, пробелы между буквами остаются
        String s12 = s1.trim();
        System.out.println(s12);
        
//      Метод replace
//      
        String s14 = s1.replace("vet","vivka");
        System.out.println(s14);
        
//      Складывает 2 string
        String s5 = "privet";
        String s6 = "drug";
        System.out.println(s5.concat("hi"));
    }
}
