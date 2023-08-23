
package Lesson_26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
//      тут происходит автобоксинг
        list.add(5);
//      Объект класса Long со значением 50. Также происходит автобоксинг
        Long l = 50l;
        
//      Здесь же происходит unboxing из ArrayList list
        int i = list.get(0);
        System.out.println(i);
        
        Number int1 = new Integer (10);
//      Не забываем кастить на нажный тип данных
        int c = (int)int1;
        
//      Будем парсить. Превращаем стринг в инт
        String s = "50";
        int ab = Integer.parseInt(s);
        
//      В парсинге boolean, все что не тру - фолс
        String s2 = "true";
        boolean b = Boolean.parseBoolean(s2);
        
        String s3 = "3.14";
        double d = Double.parseDouble(s3);
        
//      Тут мы будем применять метод valueOf 
        Integer i3 = Integer.valueOf(10);
        double d2 = Double.valueOf(s3);
        
//      ------------------------------------------------------------------
//      Пример кастинга для примитивных типов данных для wrapper Byte
        Byte b12 = new Byte((byte)25);
 //      ------------------------------------------------------------------
 
    
 
        System.out.println(ab);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(i3);
        
        
    }
}
