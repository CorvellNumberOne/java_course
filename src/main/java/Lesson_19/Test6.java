
package Lesson_19;


public class Test6 {
    public static void main(String[] args) {
        int [][] array= {{3,7,8},{4,5},{9,4,4,6,8,3}};
        
//      Элементом двумерного массива array является одномерный массив array2[]
        for (int [] array2:array){
            // Элементами одномерного массива являются значения типа int
            for(int a:array2){
                System.out.print(a +" ");
            }
        }
        
        
/*        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
*/
    }
}

/*
        1. array2 = array [0]; (3,7,8)
        2. a = array2 [0]; (3)
        3. a = array2 [1]; (7)
        4. a = array2 [2]; (8)
        5. array2 = array [1]; (4,5)
        6. a = array2 [0]; (4)
        7. a = array2 [1]; (5)
        8. array2 = array [2]; (9,4,4,6,8,3)
        9. a = array2 [0]; (9)
        10. a = array2 [1]; (4)
        11. a = array2 [2]; (4)
        12. a = array2 [3]; (6)
        13. a = array2 [4]; (8)
        14. a = array2 [5]; (3)

*/