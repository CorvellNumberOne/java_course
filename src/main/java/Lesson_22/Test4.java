
package Lesson_22;


public class Test4 {
    
    String name;
    String surname;
    
    
//  Overloaded constructor

    Test4(String s){
        this(s,null);
    }

    Test4(String n,String sn){
        name=n;
        surname=sn;
    }
  
    public static void main(String[] args) {
        Student123 s = new Student123("Stepan", "Meduza", 4);
        System.out.println(s.name + s.surname + s.course);
    }
}


class Student123 extends Test4{
    int course;
//  В наследуемых классах важно в конструкторе указывать определенныее ранее значения!
//  Проверь by default super class конструктора
//  Модифицируем родительский конструктор
    Student123(String name, String surname, int course){
        super(name,surname);
        this.course=course;
    }
}