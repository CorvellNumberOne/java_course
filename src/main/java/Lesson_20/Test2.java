
package Lesson_20;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student();
        
//      Тут мы будем работать с ArrayList и одним типом данных String

//      Инициализируем Arraylist типа String
        ArrayList <String> list1 = new ArrayList <String>();
    
        list1.add("poka");
        
//      Компилятор не позволяет добавить отличный от String тип данных
//        list2.add(st1);
    
//      Тут будем работать только со StringBuilder
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Oleg loh"));
        
//      -----------------------------------------------------------------------

//      Тут мы будем создавать ArreyList с другим листом в параметрах

        ArrayList<String> list3 = new ArrayList<String>(list1);
        System.out.println(list1==list3);
        

    
    }
}

class Student{}