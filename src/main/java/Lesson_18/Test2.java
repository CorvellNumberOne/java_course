
package Lesson_18;


public class Test2 {
    public static void main(String[] args) {
//      Declaration
        String [] array1;
        int[][] array2;
        
//      Allocation
        array1 = new String[3];
        array2 = new int[3][];
        
//      ------------------------------------------------------------------------    
//      Dynamic initialization для array1
        for (int i = 0; i < array1.length; i++) {
            array1[i]= "privet" + i;
            System.out.println(array1[i]);
        }
//      ------------------------------------------------------------------------        
//      Allocation для одномерных массивов array2
        array2[0]= new int[5]; // Одномерный массив. Нулевой элемент имеет длинну 5
        array2[1]= new int[2];
        array2[2]= new int[7];
//      ------------------------------------------------------------------------      

//      Dynamic initialization для array2
//      Создает два цикла for для строк и столбцов в массиве
//      Длинна массива array2 равна трем (3). Имеем три строки
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j]=i+j;
                System.out.println(array2[i][j]);
            }
        }
 




    }
}
