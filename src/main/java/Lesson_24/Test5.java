
package Lesson_24;


public class Test5 {
    
    public static void main(String[] args) {
       U u = new U();
       u.def();
       u.abc();
       I1.ghj();
    }
    
}

interface I1 {
//  static методы вызываются по имени интерфейса и названию метода
    public static void ghj (){
        System.out.println("static method");
    }
    
//  default могут біть только интерфейсы
    default void abc(){
        System.out.println("Это метод abc");
    }
    default void def(){
        System.out.println("Это метод def");
    }
}

class R implements I1{
    public void abc(){
        System.out.println("Это метод abc");
    }
}

class U implements I1{
    public void abc(){
        System.out.println("Это метод abc");
    
    }
}