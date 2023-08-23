package Lesson_20;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        
//      Изменяем параметры ArrayList без его методов
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            // Изменяем наши sb(1,2,3) добавляя им !!! 
            list.get(i).append("!!!");
        }

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        // Удаление по индексу
        list.remove(1);
        // Удаление по объекту
        list.remove(sb3);
        System.out.println("");

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

    }
}
