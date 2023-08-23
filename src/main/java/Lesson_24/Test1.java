
package Lesson_24;


public class Test1 {
    public static void main(String[] args) {
//        System.out.println("Hello");
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}


class A{
    String s = "Privet";
    void abc(){
        System.out.println("???");
    }
}

class B extends A{
//  Хайдим переменную S класса А, переменной s класса B
    String s = "Poka";
//  Оверлодим метод abc
    void abc(){
        System.out.println("!!!");
    }
}

class C extends B{
    
}