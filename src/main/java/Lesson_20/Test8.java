
package Lesson_20;

import java.util.*;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
//      Поработаем с методом toArray()

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        
//      Создаем массив типа данных Object и используем toArray 
        Object [] array = list1.toArray();
        
        for(Object o:list1){
            System.out.print(o.toString());
        }
        System.out.println("");
//      -----------------------------------------------------------------------        
//      toArray(Datatype[] array)

        StringBuilder [] array2 = list1.toArray(new StringBuilder[10]);
        
        for(StringBuilder sb:array2){
            System.out.println(sb);
        }
        
        StringBuilder [] array123 = {sb1, sb3, sb3, sb3};
        List<StringBuilder> list123 = Arrays.asList(array123);
        System.out.println(list123);
        array123[0].append("!!!");
        System.out.println(list123);

    }
    
}
