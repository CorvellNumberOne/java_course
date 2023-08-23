
package Lesson_18;


public class Test1 {
    public static void main(String[] args) {
        
//      1. Declaration. Объявили массивы
        int [][] array10; // Двумерный массив
        int [] array1;
        String [] array2;
        double [][] array3;
        double [] array7;
        
//      2. Allocation. Размещение в массиве
        array1 = new int[8]; // Длинна массива 8
        array2 = new String [3]; // Длинна массива 3
        array3 = new double[4][2]; // 4 одномерных массива с длиной 2
        array10 = new int[3][];
        array7 = new double [2];
        
//      Initialization. Статическая инициализация

//      Одномерный массив типа String
        array2[0] = "Privet";
        array2[1] = "Poka";
        array2[2] = "ok";
        
//      Двумерный массив типа double. Все элементы инициализировать не обязательно
        array3[0][0]= 3.14;
        array3[2][1]= 3.14;
        
//      ------------------------------------------------------------------------

        double [] array5; //  массив типа double
        array5 = new double[2]; // длинна массива равена двум
        array5[0]=2.5;
        array5[1]=3.5; // Инициализируем статически
        
//      ------------------------------------------------------------------------

        array3[1]=array5;
        array7 = array5;
        
    }
}
