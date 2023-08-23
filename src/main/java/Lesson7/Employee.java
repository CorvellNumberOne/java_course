
package Lesson7;


public class Employee {
//  Переменна которая хранит данные о ЗП
    public double salary;
    
    
//  Метод принимает значение переменной salary, умножает его 
//  на 2 и выводит результат на экран.
    public void doubleZP(){
//      Переменная result не является instance. Она пренадлежит только этому
//      методу. Ее невозможно использовать вне метода doubleZP.
        double result = salary*2;
        System.out.println("Новая ЗП составляет: " + result);
    }
    
    
//  Описываем конструктор класса Employee. Принимаем значение для salary
    public Employee(double salary2){
        salary=salary2;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println("Обычная зарплата составляет: " + emp.salary);
        
//      Вызываем метод doubleZP без параметров, так как параметры определены
//      конструктором ранее.
        emp.doubleZP();
    }
}

