
package Lesson_18;


public class Test3 {
    static String s;
    public static void main(String[] args) {
        int[] array = new int[3];
        array [0]=1;
        array [1]=2;
        array [2]=3;
//      Компилятор пропускает, так как не знает что элемента под индексом 3 нет
//      Exception. Index 3 out of bounds for length 3
//        array [3]=3;

//      -----------------------------------------------------------------------

        int [][] array2 = new int [3][]; // 3 одномерных массива
        
        System.out.println(s.length());
    }
}
