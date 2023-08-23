
package Lesson4;


public class Car {
    String color="Red";
    String engine="V6";
    
    public static void main(String[] args) {
        Car car1=new Car();
        car1.color="Black";
        car1.engine="v8";
        
        
        
        System.out.println("Цвет: "+ car1.color);
       
        System.out.println("Мотор: "+ car1.engine);
        
    }

}

class CarTest {
    

}