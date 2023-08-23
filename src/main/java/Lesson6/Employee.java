
package Lesson6;


class EmployeeTest {
    
//  У нас есть 3 overloaded конструктора с одинаковым названием
    
    EmployeeTest(int id2, String surname2, int age2){
//      Тут мы вызываем один из конструкторов с двумя параметрами, 
//      который уже существует (overloaded). Также нам нужно определить id2.
        this(id2, surname2, age2, 0.0, null);
    }
    
//  Два конструктора с одинаковым названием, НО с разными параметрами!!!
    
    public EmployeeTest(String surname3, int age3){
        this(0,surname3,age3,0.0,null);
    }
    
    EmployeeTest(int id4, String surname4, int age4, double salary4, String departament4){
      id=id4;
      surname=surname4;
      age=age4;
      salary=salary4;
      departament=departament4;
    }
    
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    
}

 public class Employee{
     public static void main(String[] args) {
//       В определенном пользователем конструкторе, создание объекта класса
//       происходит как обычно и в круглые скобки нужно передать аргументы.
         EmployeeTest emp = new EmployeeTest(02,"Иванов",32);
         System.out.println(emp.surname + emp.salary);
         
         EmployeeTest emp2 = new EmployeeTest("Петров", 30);
         System.out.println(emp2.surname);
         
         EmployeeTest emp3 = new EmployeeTest(01, "Сидоров", 40, 5200.20, "Повязки");
         
         System.out.println(emp3.departament + emp3.surname);
     }

}
