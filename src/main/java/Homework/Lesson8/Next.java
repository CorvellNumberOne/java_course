// Данный класс является эталонным образцом ДЗ 
package Homework.Lesson8;

class NextTest {

    public final static double P = 3.14;

    public double ploshad(double radius) {
        double pl = P * radius * radius;
        return pl;
    }

    public static double dlina(double radius2) {
        double dl = 2 * P * radius2;
        return dl;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + ploshad(radius3));
        System.out.println("Длина окружности = " + dlina(radius3));
    }
}


public class Next {
    public static void main(String[] args) {
        NextTest N = new NextTest();
        N.info(5);
        N.ploshad(15);
    }

}