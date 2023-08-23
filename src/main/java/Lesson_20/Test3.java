
package Lesson_20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Poka");
        list.add("Privet");
        list.add("Ok");
        list.add("UA");
        // Добавляем hello на первый индекс
        list.add(1,"hello");
        for (String s:list) {
            System.out.print(s+" ");
        }
        System.out.println("");
        
//      --------------------------------------------------------------------

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
        
//      ---------------------------------------------------------------------

        list.set(1, "!!!");
        for(String s: list){
            System.out.print(s+" ");
        }
        
//      ---------------------------------------------------------------------
        System.out.println("");
        list.remove("Ok");
        for(String s: list){
            System.out.print(s+" ");
        }
        
    }
}
