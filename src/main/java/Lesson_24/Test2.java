
package Lesson_24;


public class Test2 {
    public static void main(String[] args) {
    Figura f1 = new Kvadrat();
//  С помощью объекта f1 можно обращатся только к объектам класса Figura
        System.out.println(f1.kolvoStoron);
//      Тут происходит runtime binding
        f1.ploshad();
  
    }
}

abstract class Figura {
    

    
    void showInfo(){
        System.out.println("Это фигура");
    }
    
    int kolvoStoron=0;
//  метод может быть абстрактным только без тела
    abstract void perimetr();
    
    abstract void ploshad();
}

class Kvadrat extends Figura{
       
    int kolvoStoron=4;
    int storona = 10;
    
    public void perimetr()
    {
        System.out.println("Периметр квадрата равен: " + storona*4);
    }
    
    public void ploshad(){
        System.out.println("Площадь квадрата равна: "+ storona*storona);
    }
}

class Pryamougolnik extends Figura{
    
    int kolvoStoron=4;
    int storona1 = 8;
    int storona2 = 5;
    
    public void perimetr(){
        System.out.println("Периметр прямоугольника равен: " + (storona1+storona2)*2);
    }
    
    public void ploshad(){
        System.out.println("Площадь прямоугольника равна: "+ storona1*storona2);
    }
}

class Okrusznost extends Figura{
    int kolvoStoron=0;
    int radius=3;
    
    public void perimetr(){
        System.out.println("Периметр круга равен: " + 2*3.14*radius);
    }
    
    public void ploshad(){
        System.out.println("Площадь круга равна: "+ 3.14*(radius*radius));
    }
}

// Если класс абстрактный, то его объкты не будут созданы
abstract class Chetyrehugolnik extends Figura {
    void def (){
        System.out.println("Это четырехугольник");
    }
}