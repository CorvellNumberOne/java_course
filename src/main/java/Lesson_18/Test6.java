package Lesson_18;

public class Test6 {

    /*
    Написать метод принимающий в параметре массив и выводит его наибольший 
    наимейшие элементы.
     */

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальный элемент масиива: "+min + " Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, 9.19, -3.0};
        maxMin(array1);
        maxMin(new double []{3.14, -50, 365, 64, -98.3});
    }
}
