
package Lesson_19;


public class Test3 {
    public static void main(String[] args) {
        int [] array = {0, 6, 4, 1};
        
//      Используем массив for-each
        for(int a: array){
            System.out.print(a+" ");
        }
        
/*      Стандартный цикл for  
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i]);
        }
*/
    }
}
