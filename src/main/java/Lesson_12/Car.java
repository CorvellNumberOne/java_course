package Lesson_12;

public class Car {

    int ingine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.ingine = engine;
        this.doorCount = doorCount;
    }

    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.ingine > c2.ingine) {

            if (c1.doorCount > c2.doorCount) {
                System.out.println("Объем мотора и кол-во дверей у 1 машины больше");
            } else {
                System.out.println("Объем мотора у первой машины больше, а количество дверей меньше");
            }
        } 
        else {
            System.out.println("Объем мотора у первой машины меньше");
        }

    }

}
