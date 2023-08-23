
package Lesson_31;

import java.util.Scanner;


public class MyScanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        
        do{
            System.out.println("Введи 5");
            value = scan.nextInt();
        } while(value!=5);
        
        System.out.println("Вы ввели 5");
    }
}
