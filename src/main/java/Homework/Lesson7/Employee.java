
package Homework.Lesson7;


public class Employee {
    int id;
    public String surname;
    public int age;
    private double salary;
    String departament;
    
//  Методы ничего не принимают, будут использовать аргументы определенные конструктором
    public void showId (){
        System.out.println("Id: " + id);
    }
    
    public void showSurname (){
        System.out.println("Фамилия: " + surname);
    }
    
    public void showSalary (){
        System.out.println("Зарплата: " + salary);
    }
    
    
//  Создаем 3 конструктора с одинаковыми параметрами, но разной последовательностью принимаемых параметров.
//  Id, surname, age, salary, depart
    public Employee (int yourId, String yourSurname, int yourAge, double yourSalary, String yourDepartment){
       id=yourId;
       surname=yourSurname;
       age=yourAge;
       salary=yourSalary;
       departament=yourDepartment;
    }
    
//  Surname, id, age, salary, depart
    private Employee (String yourSurname, int yourId, int yourAge, double yourSalary, String yourDepartment){
       id=yourId;
       surname=yourSurname;
       age=yourAge;
       salary=yourSalary;
       departament=yourDepartment;
    }

//  Age, id, Surname, salary, depart
    Employee (int yourAge, int yourId, String yourSurname, double yourSalary, String yourDepartment){
       id=yourId;
       surname=yourSurname;
       age=yourAge;
       salary=yourSalary;
       departament=yourDepartment;
    }
    
    public static void main(String[] args) {
        
//      Для экземпляров emp будут использоваться методы созданные ранее

        Employee emp1 = new Employee(123,"Ivanov",23, 50000.23, "Повязки");
        Employee emp2 = new Employee("Petrov", 321,40,4000.36, "Допы");
        Employee emp3 = new Employee(23, 963, "Sidorov", 1000.30,"Малярка");

        
//      Что бы вызвать метод в экземпляре класса нужно указать: Екземпляр_класса.Название метода

        emp1.showSurname();
        emp1.showId();
        emp1.showSalary();
        
//      ------------------------------------------------------------------

        System.out.println("");
        emp2.showSurname();
        emp2.showId();
        emp2.showSalary();
        
//      ------------------------------------------------------------------

        System.out.println("");
        emp3.showSurname();
        emp3.showId();
        emp3.showSalary();
        
    }
}


