
package Lesson_23;


public class Test5 {
    public static void main(String[] args) {
        Employee2 e = new Teacher2();
        Employee2 emp2 = new Employee2();
        Teacher2 t = new Teacher2();
        t.sleep();
        
    }
}

class Employee2 {

    String name;
    double salary=100;
    
    Eda eat(){
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    private void sleep() {
        System.out.println("Работник спит");
    }
}

class Teacher2 extends Employee2 {

    int pupils;
    
    @Override
    Eda eat(){
        System.out.println("Кушает работник");
        Eda e = new Eda();
        return e;
    }

    void teach() {
        System.out.println("Учить");
    }
    
    public void sleep() {
        System.out.println("Учитель спит");
    }

}


final class T {}
// final Классы не наследуются
//class P extends T {}