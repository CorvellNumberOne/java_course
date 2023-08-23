
package Lesson_23;


public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();
    }
}

class Eda{}
// return type sub класса еда - может быть фрукты***
class Frukty extends Eda{}

class Employee {

    String name;
    int age;
    int expirience;
    double salary=100;

    public Eda eat() {
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Teacher extends Employee {

    int pupils;

    void teach() {
        System.out.println("Учить");
    }
    //***
    public Frukty eat() {   
        System.out.println("Кушает учитель");
        Frukty f = new Frukty();
        return f;
    }
}