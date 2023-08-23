package Lesson_13;

public class Employee {

    public static void main(String[] args) {
        switch ("Пятница") {
            case "Понедельник":

            case "Вторник":

            case "Среда":

            case "Четверг":

            case "Пятница":
                System.out.println("Работаем до 18:00");
                break;
            case "Суббота":
                System.out.println("Работаем до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Работы нет, выходной!");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
