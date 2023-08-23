package Lesson_22;

// Наследование
public class Test3 {
    void moreMoney(Employee e){
        e.salary=e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc  = new Doctor();
        doc.name="Ivan";
        doc.age=32;
        doc.expirience=25;
        doc.eat();
        doc.specializ="Хирург";
        System.out.println("Возраст доктора: "+doc.age+" года");
        
        Dantist dan = new Dantist();
        dan.age=25;
    }
}

class Employee extends java.lang.Object{

    String name;
    int age;
    int expirience;
    double salary=100;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee {

    String specializ;

    void treat() {
        System.out.println("Лечить");
    }
}

class Hirurg extends Doctor {
    String skalpel;
    void oper(){    
    }
}

class Dantist extends Doctor {
    
}

class Teacher extends Employee {

    int pupils;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver {

    String car;

    void drive() {
        System.out.println("Водить");
    }
}
