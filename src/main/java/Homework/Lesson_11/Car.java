
package Homework.Lesson_11;


public class Car {
    String color;
    String engine;
    int doors;
    
    Car (String color, String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
    
//  Меняем кол-во дверей
    
    void quantityDoors (int doors){
        this.doors = doors;
        System.out.println("Кол-во дверей стало: " + this.doors);
    }
    
//  V2 кол-во дверей
    void quantityDoors (Car c, int doors){
        c.doors=doors;
        System.out.println("Кол-во дверей стало: " + c.doors);
    }
    
    
//  Принимаем параметры и меняем цвета местами
    
    public static void swapColor (Car C1, Car C2){
        String C3 = C1.color;
        C1.color=C2.color;
        C2.color=C3;
        
//        System.out.println("C1 color: " + C1.color);
//        System.out.println("C2 color: " + C2.color);
//        System.out.println("C3 color: " + C3); 

    }
    
    
    public static void main(String[] args) {
        Car car1 = new Car("Red","V6",4);
        Car car2 = new Car("Yellow","V4",2);
        Car car3 = new Car("Green","V4",3);
        
//        System.out.println("Кол-во дверей было: "+car1.doors);
//        car1.quantityDoors(18);
        
//        System.out.println("Кол-во дверей было: "+ car2.doors);
//        car2.quantityDoors(6);
        
//      ------------------------------------------------------
        System.out.println("Изначальный цвет car1: " + car1.color+ " Кол-во дверей: " + car1.doors+" Мотор: " + car1.engine);
        System.out.println("Изначальный цвет car2: " + car2.color+ " Кол-во дверей: " + car2.doors+" Мотор: " + car2.engine);
        swapColor(car1,car2);
        System.out.println("Новый цвет car1: " + car1.color+ " Кол-во дверей car1: " + car1.doors+" Мотор: " + car1.engine);
        System.out.println("Новый цвет car2: " + car2.color+ " Кол-во дверей car1: " + car2.doors+" Мотор: " + car2.engine);
        
        car3.quantityDoors(car3, 5);
        
    }
         
}
