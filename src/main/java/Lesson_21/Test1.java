package Lesson_21;

public class Test1 {

    public static void main(String[] args) {
//      Работаем с тернарным оператором

        int a = 4;
        System.out.println((a < 4 ? 7 : "privet"));

//      ----------------------------------------------------------------------
        int a1 = 50;
        int b1 = 5;
        int c1 = (a<6)? a1++:b1++;
        System.out.println("а " + a1);
        System.out.println("b " + b1);
        System.out.println("c "+c1);
    }
}
