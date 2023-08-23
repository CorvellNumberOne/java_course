
package Homework.Lesson6;


public class Overloaded {
    public static void main(String[] args) {
        Calculate Sum41 = new Calculate();
        Sum41.summa(1,1,1,1);
        Sum41.summa(1,1,1);
        Sum41.summa(1,1);
        Sum41.summa(1);
        Sum41.summa();
    }
}

class Calculate {
    
    int summa (int a, int b, int c, int d) {
        int result4 = a+b+c+d;
        System.out.println("Сумма четырех чисел равна: " + result4);
        return result4;
    } 
    
    int summa (int a, int b, int c) {
        int result3 = a+b+c;
        System.out.println("Сумма трех чисел равна: " + result3);
        return result3;
    } 
    
    int summa (int a, int b) {
        int result2 = a+b;
        System.out.println("Сумма двух чисел равна: " + result2);
        return result2;
    }
    
    int summa (int a) {
        int result1=a;
        System.out.println("Вы ввели одно число: "+result1);
        return a;
    }
    
    int summa () {
        int result = 0;
        System.out.println("Укажи аргументы!!! Сумма нихуя = " + result);
        return result;
    }
}