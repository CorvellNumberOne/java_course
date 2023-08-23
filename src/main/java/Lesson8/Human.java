
package Lesson8;


class Car{
    String color = "Blue";
    String engine = "V6";
}

public class Human {
    String name = "Ivan";
    final Car c = new Car();
        public static void main(String[] args) {
            Human h1 = new Human();
//            Мы не можем переопределить объект c класса Car, потому что он
//            использует модификатор non-access final
//            h1.c = new Car();
//            h1.c = new Car();

//          Мы можем менять значение engine, потому что тут мы обращаемся
//          к классу Car, а не к экземпляру c класса Car. Если в классе Car
//          переменной engine указать final тогда мы уже не сможем редактировать
//          ее в данном выражении:
            h1.c.engine = "V8";
    }
}
