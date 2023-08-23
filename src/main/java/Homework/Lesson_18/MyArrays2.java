
package Homework.Lesson_18;


public class MyArrays2 {
    public static void showArray (String[][]arrays){
        
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                
                if (arrays[i][j]==null)
                continue;
                System.out.println(arrays[i][j]);
                
            }
        }
    }
    
    public static void main(String[] args) {
        String [][] array1 = new String[3][12];
        array1 [0][0]="1 Privet! ";
        array1 [0][1]="1 kak dela?";
        array1 [1][10]="2 У меня все хорошо!";
        array1 [2][10]="3 Ну и ";
        array1 [2][11]="3 слава богу!!!";
        
        
        
        showArray(array1);
    }
}
