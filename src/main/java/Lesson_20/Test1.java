
package Lesson_20;

// Всегда импортируй ArrayList перед работой с ним!
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
/*      Так практически никогда не делают, обычно работают с ArrayList одного 
        типа данных. Данный код выполнен как пример, что AL может принимать 
        любые типы данных, кроме примитивных.
        
        Создаем новый объект класса ArrayList
*/ 
        ArrayList list = new ArrayList();
        
        // Добавляем ему объект класса String со значением "Privet"
        list.add("Privet");
        
        //Создаем новый объект класса Car
        Car c = new Car();
        
        //Добавляем объект класса Car в объект класса list
        list.add(c);
        
        //Создаем новый объект класса Student
        Student s = new Student();
        
        //Добавляем объект класса Student в объект класса list
        list.add(s);
        
        // Добавляем объекту list объект типа StringBuilder со значением "ok"
        list.add(new StringBuilder("ok"));
    }
}

class Car{}
class Student{}