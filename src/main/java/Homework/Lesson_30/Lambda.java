
package Homework.Lesson_30;

import java.util.ArrayList;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        
        Employee emp1= new Employee("John Doe", "HR", 20000.0);
        list.add(emp1);
        Employee emp2 = new Employee("Jane Smith", "HR", 60000.0);
        list.add(emp2);
        Employee emp3 = new Employee("Michael Johnson", "Finance", 75000.0);
        list.add(emp3);
        Employee emp4 = new Employee("Emily Brown", "Marketing", 55000.0);
        list.add(emp4);
        Employee emp5 = new Employee("David Lee", "Engineering", 70000.0);
        list.add(emp5);
        Employee emp6 = new Employee("Sarah Wilson", "Sales", 5000.0);
        list.add(emp6);
        Employee emp7 = new Employee("Robert Martinez", "Operations", 65000.0);
        list.add(emp7);
        Employee emp8 = new Employee("Karen Taylor", "Customer Support", 50000.0);                                     
        list.add(emp8);
        
        TestEmployee TEmp = new TestEmployee();
        
        System.out.println("------------------------------------------------");
        
        TEmp.filtracijaRabotnikov(list, (Employee emp) -> {return emp.depart=="HR" && emp.salary>=60000.0;});
        TEmp.filtracijaRabotnikov(list, (Employee emp) -> {return emp.name.startsWith("J") && emp.salary>=50000.0;});
        TEmp.filtracijaRabotnikov(list, (Employee emp) -> {return emp.name==emp.depart;});
    }
}

class Employee {
    String name;
    String depart;
    double salary;
    
    Employee(String name, String depart, double salary){
        this.name=name;
        this.depart = depart;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmployee(Employee emp){
        System.out.println("Imya rabotnika: "+ emp.name+", departament: "+emp.depart+ ", zarplata: " + emp.salary);
    }
    
    void filtracijaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> emp){
        System.out.println("");
        for(Employee e: aL){
            if(emp.test(e)){
                printEmployee(e);
            }
        }
    }      
}