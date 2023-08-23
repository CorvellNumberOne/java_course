
package Lesson_25;


public class Test1 {
    public static void main(String[] args) {

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able ha = new Teacher();
        
        Employee [] array={emp1, emp2, emp3};
        
//        for(Employee emp:array){
//            emp.work();
//        }
        System.out.println("");
    }
}

abstract class Employee implements Help_able{
    void sleep(){
        System.out.println("Epmloyee sleeps");
    }
    
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    @Override
    void work(){
        System.out.println("Teacher works");
    }
    
    @Override
    public void help(){
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee{
    @Override
    void work(){
        System.out.println("Driver works");
    }
    
    @Override
    public void help(){
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee{
    @Override
    void work(){
        System.out.println("Doctor works");
    }
    
    @Override
    public void help(){
        System.out.println("Doctor helps");
    }
}

interface Help_able{
    void help();
}