package Lesson_23;

public class Test2 {
//  Возможно создавать методы и возвращать тип данных саб класса
    public Doctor abc(){return new Hirurg();}
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Employee emp1 = new Doctor();
        
//      Doctor это Employee, поэтому можно создавать другой объект
//      Наоборот писать нельзя
//      Doctor dr1 = new Employee(); Так нельзя писать
        System.out.println(emp1.name);
        Employee emp2 = new Driver();
        Employee emp3 = new Teacher();
        Hirurg x = new Hirurg();
        Doctor dx = new Hirurg();
        
        
        
    }
}

class Employee{

    String name="Petro";
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

class Teacher extends Employee {

    int pupils;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver extends Employee{

    String car;

    void drive() {
        System.out.println("Водить");
    }
}
