
package Lesson_16;


public class Test1_4 {
    public static void main(String[] args) {
       Employee e1 = new Employee (100.5,true);
        System.out.println("Он менеджер? " + e1.isManager + " его зарпалата " + e1.salary);
    }
}


class Employee {
    double salary;
    boolean isManager;
    
    Employee (double salary, boolean isManager){
        this.isManager=isManager;
        this.salary=salary;
    }
    
}