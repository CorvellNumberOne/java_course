
package Lesson7;


public class AnotherClass {
    public static void main(String[] args) {
        Employee emp = new Employee(1000.30);
        System.out.println("Обычная зарплата составляет: " + emp.salary);
        
//      Вызываем метод doubleZP без параметров, так как параметры определены
//      конструктором ранее.
        emp.doubleZP();
    }
}
