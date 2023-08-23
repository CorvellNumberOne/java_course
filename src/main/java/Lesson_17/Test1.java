
package Lesson_17;

class Car {
    
}


public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50); // Вместимость: 50 символов 
        StringBuilder sb4 = new StringBuilder(sb2);
        
        
        System.out.println(sb4);
        System.out.println(sb2.length());
//      Показывает символ указанный в параметре
        System.out.println(sb2.charAt(4));
        
//      Показывает индекс символа в строке начиная с необходимого индекса
        System.out.println(sb2.indexOf("o",2));
        
//      Создает подстроку начиная с заданного индекса
        String s = sb2.substring(5);
        System.out.println(s);
//      Создает подстроку начиная с заданного индекса и до нужного индекса
        String s2 = sb2.substring(5,8);
        System.out.println(s2);
        
//      Похож на substring, только выводит последовательность символов
        System.out.println(sb2.subSequence(5, 8));
        
/*
        Обновляет значение объекта, который его вызвал. В sb2="God day!!! + 22"
        Приминимает любой примитивный тип данных, объект, класс.
*/
        sb2.append(22);
        System.out.println(sb2);
        
//      Принимает любые типы данных
        sb2.append(true);
        System.out.println(sb2);
        
//      Даже самого себя
        sb2.append(sb2);
        System.out.println(sb2);
        
        sb2.append("Hi!");
        System.out.println(sb2);
        
        sb2.append(new Car());
        System.out.println(sb2);
        
        
        
    }
}
