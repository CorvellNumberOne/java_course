
package Lesson_26;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        Car c4 = new Car("Black", "V8");
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        
        System.out.println(c2);
//        System.out.println(list.contains(c4));
//        System.out.println(c1.equals(c2));

        
        
    }
}

class Car {
    
    String color;
    String engine;
    
    Car(String color, String engine){
        this.color=color;
        this.engine = engine;
    }
//  перезаписываем метод equals
    public boolean equals (Object obj){
        if(obj instanceof Car){
//          Выполняем кастинг объекта obj к нужному классу
            Car c2 = (Car)obj;
            return (color.equals(c2.color)&&engine.equals(c2.engine));
        }
        else{
            return false;
        }
    }
    
//  перезаписываем метод toString
    public String toString(){
        return "Machines color: " + color +" with engine: " + engine;   
    }

}

