
package Lesson_14;


public class Test5 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
//          Когда i == 87, вступит в силу оператор continue и весь код после 
//          него будет игнорироваться и начнется новая итерация

            if (i==87){
                continue;
            }
            System.out.println(i);
        }
    }
}
