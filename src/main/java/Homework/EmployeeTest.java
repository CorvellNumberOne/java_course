
package Homework;


class Employee{
    
    int id2;
    int age2;
    double salary2;
    String surname2;
    String departament2;
    
    Employee(int id, int age, double salary, String surname, String departament){
        
        id2=id;
        age2=age;
        salary2=salary;
        surname2=surname;
        departament2=departament;
    }
    
    double SalaryX2 (){
        salary2*=2;
        return salary2;
    }
    
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee P1 = new Employee(01,22,5200.55, "Иванов", "Голубцы");
        Employee P2 = new Employee(02,32,9600, "Петров", "Хуирцы");
        
        P1.SalaryX2();
        P2.SalaryX2();

        System.out.println("Новая Зп работника: " + P1.surname2 + P1.salary2);
        System.out.println("Новая Зп работника: " + P2.surname2 + P2.salary2);
    }
}
