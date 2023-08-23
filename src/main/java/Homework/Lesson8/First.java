package Homework.Lesson8;

class Second {

//  Создаем константу P присвоив ей модификатор static
    static final double P = 3.1415926535;

//  Вычисляем площадь круга
    public void area(double radius) {
        System.out.println("Площадь круга при радиусе " + radius + " см2 равна: " + P * (radius * radius) + " см2");
    }

//  Вычисляем периметр круга
    public static void perimeter(double radius) {
        System.out.println("Длинна окружности при радиусе: " + radius + " см2 равна: " + 2 * P * radius + " см2");
    }

//  Експерементальный метод выводящий радиус, площадь круга и периметр круга
//  используя уже созданные ранее методы.
    public void experiment(double radiusExperiment) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Радиус круга равен: " + radiusExperiment);
        area(radiusExperiment);
        perimeter(radiusExperiment);

    }

//  Умножение двух чисел
    static double mult(double one, double two, double three) {
        return one*two*three;
    }

//  Деление с остатком
    static void div(int one, int two) {
        System.out.println("Целое частное составляет: " + one / two + "; Остаток от деления состовляет: " + one % two);
    }

}

public class First {

//  Нам не нужно создавать конструктор Second в классе First для методов так,
//  данные методы имеют модификатор static.
    public static void main(String[] args) {
//      Согласно заданию выводим два раза на экран результаты работы методов умножения и деления с остатком.
        System.out.println(Second.mult(1, 2, 3));
        Second.div(11, 2);
        System.out.println(Second.mult(1, 1, 3));
        Second.div(8, 2);

        Second sec1 = new Second();
        sec1.area(25);

        Second.perimeter(19);
        System.out.println("Число Пи равно:" + Second.P);
        sec1.experiment(12.3);
    }

}
