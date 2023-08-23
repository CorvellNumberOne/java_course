
package Homework.Lesson7;


public class Test {
    public static void main(String[] args) {
//      Тут мы будем создавать экземпляры класса Employee и тестировать доступ к переменным, конструкторам

//      У данного конструктора к классе Employee указан модификатор public

        Employee emp4 = new Employee(741,"Demidov",32, 5123000.32, "IT");

//      Методы работают корректно благодаря модифаторам public

        emp4.showSurname();
        System.out.println("Возраст: " + emp4.age);
        System.out.println("Департамент: " + emp4.departament);
        emp4.showId();
        emp4.showSalary();
//      Дання переменная не может быть выведена из-за ее модификатора доступа в классе Employee
//      System.out.println(emp4.salary);
        
//      Данный контструктор не будет создавать новый объект, так как 
//      в классе Employee стоит модификатор privat.

//      Employee emp5 = new Employee("Davidov", 999, 56, 100.00, "Magaz");
        
//      emp5.showSurname();
//      emp5.showId();
//      emp5.showSalary();

        Employee emp5 = new Employee(100, 001, "Ded", 100.0,"Литейка");
        
        System.out.println("");
        
        emp5.showSurname();
        System.out.println("Возраст: " + emp5.age);
        System.out.println("Департамент: " + emp5.departament);
        emp5.showId();
        emp5.showSalary();
        
    }
    
}
