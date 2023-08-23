package Homework.Lesson_10.p4;

import Homework.Lesson_10.p1.A;
import static Homework.Lesson_10.p1.p2.B.showHello;
import static Homework.Lesson_10.p1.p2.B.ab;
import Homework.Lesson_10.p1.p2.p3.C;
import Homework.Lesson_10.p4.p5.E;


public class D {

    public static void main(String[] args) {
//      Используем конструктор класса А
        A a = new A();
        a.showHello();
//      Используем статичную переменную ab класса B, увеличиваем ее на 1. 
//      Также используем метод showHello того же класса.
        ab++;
        System.out.println(ab);
        showHello();
//      Вызов метода объекта класса С
        C c = new C();
        c.showHello();
//      Вызываем метод класса Е
        E e = new E();
        e.showHello1();
        
    }

}
