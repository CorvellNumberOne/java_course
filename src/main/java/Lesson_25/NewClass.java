
package Lesson_25;


public class NewClass {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c = null;
        System.out.println(c.a);
        
    }
}


class Car {
    static int a = 5;
}