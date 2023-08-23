package Homework.Lesson_13;

public class Month {

    
// Тренируемся использовать switch
    
    public static void numberOfMonth(int a) {
        switch (a) {
            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10: 
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9: 
            case 11:        
                System.out.println("В этом месяце 30 дней");
                break;         
            default:
                System.out.println("Введите порядковый номер месяца от 1 до 12");
                

        }
    }

    public static void main(String[] args) {
//      Для вызова статического метода из другого класса следует указывать название класса
        Month.numberOfMonth(6);
    }
}
