
package Lesson_11;


public class Employee {
    public String name;
    public double salary;
    
    Employee (String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    
    public double uvelichitel (double a){
        a=a*2;
        return a;
    }
    
//  Данный метод позволяет нам увеличивать значение переменной salary в 2 раза,
//  а не использовать ее в качества аргумента.
    public double zp2 (){
        salary*=3;
        return salary;
    }
    
    public static void main(String[] args) {
        Employee emp1 = new Employee ("Ivan",100.3);
//      В качестве аргумента метода uvelichitel используем переменную salary объекта emp1
//      Приравниваем return метода uvelichitel переменной d.

//      Когда мы подставляем примитивный тип данных в параметр метода,
//      мы подставляем только лишь его значение!!!

        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        
//      --------------------------------------------------

        emp1.zp2();
        System.out.println(emp1.salary);
    }
}

