package Lesson_24;

public class Test3 {
    public static void main(String[] args) {
        Swim_able sa = new Driver();
        Help_able ha = new Driver();
        Employee e = new Driver();
        System.out.println(ha.a);
    }
}

class Employee {

    String name;
    int age;
    int expirience;
    double salary = 100;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

// Что бы использовать интерфейс, нужно написать слово implements
class Teacher extends Employee implements Help_able {

    int pupils;

    void teach() {
        System.out.println("Учить");
    }

    public void pomosh() {
        System.out.println("Учитель оказывает помощь");
    }

    public void tushytPozhar(String s) {
        System.out.println("Учитель тушит пожар с помощью: " + s);
    }
}

// Что бы использовать интерфейс, нужно написать слово implements
// и указать через запятую интерфейсы
class Driver extends Employee implements Help_able, Swim_able {

    String car;

    void drive() {
        System.out.println("Водить");
    }
//  Для абстрактных методов modifier всегда public!
    public void pomosh() {
        System.out.println("Водитель оказывает помощь");
    }

    public void tushytPozhar(String s) {
        System.out.println("Водитель тушит пожар с помощью: " +s);
    }

    public void swim() {
        System.out.println("Водитель плавает");
    }

}

//  Интерфейс может содержать только абстрактные методы!!!
//  в Интерфейсе можно не писать, что это абстрактные методы
interface Help_able {

    void pomosh();

    void tushytPozhar(String predmet);
    
    public static final int a = 10;
}

//  by default acsesses modifiers в интнрфейсах public и abstract!!!
//  Интерфейс может содержать из переменных только константы!!!
interface Swim_able {

    void swim();
}
