
package Lesson7;


public class A {
    public static void main(String[] args) {
//      Внутри класса A создаем новый объект класса B. Это возможно при условии,
//      что класс В находится внутри одного пакета с классом А!!!
        B object = new B();
        Lesson6.C C1 = new Lesson6.C(500);
        System.out.println(C1.id);


        
    }
}
