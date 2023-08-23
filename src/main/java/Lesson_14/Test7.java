package Lesson_14;

public class Test7 {

    public void time() {
//      Для первго цикла for мы даем ему label OUTER
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало outer loop");
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (minuta == 30) {
                    break OUTER;
                }
                System.out.println(chas + ":" + minuta);

            }
            System.out.println("Конец outer loop");
        }
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.time();
    }

}
