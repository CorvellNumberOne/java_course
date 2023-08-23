
package Lesson5;


class carPar {
    
    carPar(String cvet, String motor){
        color=cvet;
        engine=motor;
        
    }
    
    String color;
    String engine;
}

public class Car2v2 {
    public static void main(String[] args) {
        carPar car1=new carPar("Yellow", "V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
