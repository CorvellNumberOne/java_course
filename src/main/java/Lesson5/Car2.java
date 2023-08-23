
package Lesson5;

class Car2Test {

    String color;
    String engine;
    int speed;
    
    
//  Создаем метод
    int gaz (int skorost){
//     Тут мы добавляем к скорости ускорение и складываем их 
       speed+=skorost;
       return speed;
    }
    
    int tormoz (int skorost){   
//     Тут мы добавляем к скорости ускорение и складываем их 
       speed-=skorost;
       return speed; 
    }
    
    void showInfo(){
        System.out.println("Цвет " + color + " мотор " + engine +" " + "скорость: " + speed);
    }
}

public class Car2 {
    public static void main(String[] args) {
        Car2Test C1=new Car2Test();
        C1.color="white";
        C1.engine="V6";
        C1.speed=60;
        C1.gaz(20);
        C1.showInfo();
        
        C1.tormoz(35);
        C1.showInfo();
        
        
    }
}
