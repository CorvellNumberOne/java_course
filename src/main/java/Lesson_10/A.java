package Lesson_10;

//  Импортируем классы car и student из package Lesson9
//import Lesson9.Car;
//import Lesson9.Student;
//  Импортируем все классы пакетов Lesson9 и Lesson8
import Lesson9.*;
//import Lesson8.*;

public class A {

    public static void main(String[] args) {
//      Не забываем указать public statement в импортируемом классе 
        Lesson9.Car c1 = new Lesson9.Car("Red", "V6");
        Car c2 = new Car("White", "V8");
        
//      Импортируем другой класс из пакета Lesson9
        Lesson9.Student st1 = new Lesson9.Student();
//        Lesson8.Student st2 = new Lesson8.Student();
    }
}
 