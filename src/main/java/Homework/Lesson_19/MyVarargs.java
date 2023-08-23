package Homework.Lesson_19;

public class MyVarargs {

    public static void abc(String[]... arrayInput) {

        String[][] arraySet = arrayInput;

        for (int i = 0; i < arrayInput.length; i++) {
            // Показывает кол-во элементов в массиве
//                System.out.print(arraySet[i].length);
            for (int j = 0; j < arraySet[i].length; j++) {

                System.out.print(arraySet[i][j] + " ");
            }
        }
    }

    public static void abcd(String[]... arrayInput) {

        String[][] arraySet = arrayInput;
        // 
        for (String[] subArray : arraySet) {
            System.out.print(subArray.length+" ");
            
            for (String element : subArray) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        String[] testArray1 = {"Hello", "Bye", "ok"};
        String[] testArray2 = {"mr", "Artem"};
        String[] testArray3 = {"Tea", "Number", "132", "Alloha"};
        String[] testArray4 = {null, null};
        String[] testArray5 = {"Rockstar"};

        //MyVarargs.abc(testArray1, testArray2, testArray3, testArray4);
        MyVarargs.abcd(testArray1, testArray2, testArray3, testArray4, testArray5);
    }
}
