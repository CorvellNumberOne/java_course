
package Lesson_20;

import java.util.ArrayList;


public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

//      Клонирует наш ArrayList и ссылки на его объекты

        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();

        System.out.print("Равны ли объекты list1 и list2: ");
        System.out.println(list1.get(0)==list2.get(0));
        System.out.println("");
        
//      Изменяем родительский объект
        list1.get(0).append("!!!");
        
//      Меняются оба объекта, так как мы только изменяем существующий объект
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println("");
        
//      Тут мы создаем новый объект. У list2 останется ссылка на старое значение 
//        list1.set(0, new StringBuilder("D"));
//        System.out.println("Изменятся ли наши ArrayList`s? Да!");
        
//        System.out.println(list1.toString());
//        System.out.println(list2.toString());

    }
}
