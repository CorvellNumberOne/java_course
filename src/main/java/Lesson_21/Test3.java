
package Lesson_21;


public class Test3 {
//  Был конструктор, а стал метод
    void Test3(){
        System.out.println("Создался объект");
    }
    
    Test3(){
        System.out.println("Это конструктор");
    }
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}

class A {
    public void abc(){
        Test3 t = new Test3();
    }
    
}