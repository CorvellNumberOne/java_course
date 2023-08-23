
package Lesson_31;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведи цифру 5");
        int value = scan.nextInt();
        while(value!=5){
            System.out.println("Ну камон, введи уже 5");
            value = scan.nextInt();
        }
        System.out.println("Вы ввели 5!");
    }
}
