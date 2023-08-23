
package Lesson_23;


public class Test7 {
    public static void main(String[] args) {
//      c1 является типом данных А, поэтому вызовется метод abc класса A
        A c1 = new C();
//      Любой объект B является объктом А
        c1.abc(new B());
    }
}


class A {
    void abc (A a){
        System.out.println("A");
    }
}

class B extends A {
//  abc не перезаписан, т.к. разные аргументы
//  Класс B имеет в себе 2 метода abc они перезагруженные
    void abc (B b1){
        System.out.println("B");
    }
}

class C extends B {
//  А этот метод перезаписал метод abc в классе B
//  Также в классе C есть метод abc класса А
    void abc (B b2){
        System.out.println("C");
    }
}