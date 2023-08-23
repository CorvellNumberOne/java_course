
package Lesson_15;


public class Tets10 {
//  Используем 2 цикла, for и while
    public static void main(String[] args) {
        OUTER:
        for (int chas=0; chas<24; chas++){
//          Инициализируем переменную минута для while
            int minuta=0;
            INNER:
            while (minuta<60){
                System.out.println(chas+":"+minuta);
                minuta++;
            }
        }
    }
   
}
