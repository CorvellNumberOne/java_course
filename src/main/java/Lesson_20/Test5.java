
package Lesson_20;

import java.util.ArrayList;

public class Test5 {
    // Раcсматриваем методы addAll
    public static void main(String[] args) {
        
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        

        list1.add(new StringBuilder ("Hello"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("bye"));
        list1.add(new StringBuilder("Privet "));
        
        for (StringBuilder s1 : list1) {
            System.out.print(s1 + " ");
        }
        
        System.out.println("");
//      -----------------------------------------------------------------------

        ArrayList <StringBuilder> list2 = new ArrayList<>();
        
        
        
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        for (StringBuilder s2 : list2) {
            System.out.print(s2 + " ");
        }

        System.out.println("");
//      ---------------------------------------------------------------------
//      Добавляем ArrayList list2 на место 1-го индекса в list1
        list1.addAll(1,list2);
        
        for (StringBuilder s1 : list1) {
            System.out.print(s1 + " ");
        }
        
        System.out.println("");
        
//      ---------------------------------------------------------------------
        
        list2.get(1).append("!");
        
//        list1.clear();
//        list2.clear();
        
        list2.indexOf("!");
                
        for (StringBuilder s1 : list1) {
            System.out.print(s1 + " ");
        }
        
        
        System.out.println(list1.toString()+" ");

    }
    
    
    
}
