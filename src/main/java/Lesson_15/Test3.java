package Lesson_15;

public class Test3 {

    public static void main(String[] args) {

        boolean b2 = true;

        int a = 1;

        while (b2) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b2 = false;
            }
            a++;
        }
    }

}
