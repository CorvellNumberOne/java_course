
package Lesson_20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add(new String ("Privet"));
        list.add(new String ("Hello"));
        list.add(new String("ok"));
        list.add(new String("bye"));
        list.add(new String("Privet"));
        
        for(String s:list){
            System.out.print(s +" ");
        }
        
//      Показывает на каком индексе находиться то или иное слово
        System.out.println("");
        System.out.println(list.indexOf("Privet"));
        
//      Показывает индекс последнего указанного слова
        System.out.println("Последний индекс объекта 'Privet' "+list.lastIndexOf("Privet"));
        
        
//      Метод size(), работает как и lenth
        System.out.println("Кол-во элементов в ArrayList: "+list.size());
        
//      Возможно очистить ArrayList list, тогда isEmpty() покажет true
//        list.clear();

        System.out.println("Пустой ли наш ArrayList? " + list.isEmpty());
        
//      Метод contains() показывает содержит ли ArrayList нужный нан объект или нет
        System.out.println("Содержит ли list оъект 'bye': "+list.contains("bye"));
        
//      Показывает как выгдядит наш list в виде String`а 
        System.out.println(list.toString());
    }
}
