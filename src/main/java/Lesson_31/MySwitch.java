
package Lesson_31;

import java.util.Scanner;

public class MySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        String age = scan.nextLine();
        switch(age){
            case "0":
                System.out.println("Ты родился");
                break;
            case "7":
                System.out.println("Ты пошел в школу");
                break;
            case "18":
                System.out.println("Ты студент");
                break;
            default:
                System.out.println("Уже всьо");
        }
    }
}
