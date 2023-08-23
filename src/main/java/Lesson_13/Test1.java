package Lesson_13;

public class Test1 {

    int grade;

    Test1(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Test1 t = new Test1(5);

        /*      Данный код слишком велик, мы будем использовать switch
        if (t.grade == 2) {
            System.out.println("Студент двоечник");
        } else if (t.grade == 3) {
            System.out.println("Студент троечник");
        } else if (t.grade == 4) {
            System.out.println("Студент хорошист");
        } else if (t.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("Оценка не верна");
        }
         */
        switch (t.grade) {
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не корректная");

        }

    }

}
