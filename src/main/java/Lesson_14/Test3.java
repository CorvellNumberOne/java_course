
package Lesson_14;


public class Test3 {
    public static void main(String[] args) {
/*      Если мы укажем в condition значение false - это будет значить что,
        цикл прерывается и пересает выполняться. Код который должен
        выполнятся будет работать до тех пор, пока значение будет true.
*/
        for (int i=2; i<=30; i=i+2){
            System.out.println(i);
        }
        
//      Тут действует исключение из правил, если if false - выполняй else.
        if (false){
            System.out.println("Не работаем");
        }
    }
}
