package Lesson_22;
class Employee extends java.lang.Object{

    String name;
    int age;
    int expirience;
    double salary=100;

    void eat() {
        System.out.println("������");
    }

    void sleep() {
        System.out.println("�����");
    }
}

class Doctor extends Employee {

    String specializ;

    void treat() {
        System.out.println("������");
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
        System.out.println("�����");
    }
}

class Driver {

    String car;

    void drive() {
        System.out.println("������");
    }
}