
package Lesson_25;


public class Test3 {
    public static void main(String[] args) {
//      использования upcasting

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        
        Employee[] array = {emp1,emp2,emp3,emp4};
        
//      Эта шляпа не работает по непонятным причинам
        for(Employee e:array){
//          instanceof оберегает нас от runtime exeption
//          Employee е относится к классу Driver? Да!
            if(e instanceof Driver){
//              Так как е это Employee, то надо выполнить downcasting
                System.out.println(((Driver)e).car);
            } 

        }
    }
}

class Employee extends java.lang.Object{

    String name;
    int age;
    int expirience;
    double salary=100;

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleep");
    }
}

class Doctor extends Employee implements Help_able{

    String specializ="Hirurg";
    
    public void help(){System.out.println("Doctor okazivaet pomosh");};

    void treat() {
        System.out.println("lechit");
    }
}

class Teacher extends Employee {

    int pupils;

    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee{

    String car="Mercedes";

    void drive() {
        System.out.println("drive");
    }
}

interface Help_able {
    void help();
}