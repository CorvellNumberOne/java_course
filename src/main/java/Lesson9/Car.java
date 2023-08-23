package Lesson9;

public class Car {

    String color;
    public static int ab = 101;
    String engine;
    public static int count;

    public static void changeA(int b) {

    }

    public Car(String color, String engine) {
//      Переменные x,y видны только в рамках данного конструктора
        int x = 5;
        int y = x + 10;

        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        this.changeColor("red");
    }

    public void changeColor1(String color3) {
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        this.color = color3;
        cena += 1000;
    }

    void changeColor(String color) {
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "V6");
        System.out.println(c1.color);
        c1.changeColor("Black");
        System.out.println(c1.color);
    }
}
