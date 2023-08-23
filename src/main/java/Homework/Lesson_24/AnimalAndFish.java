
package Homework.Lesson_24;


public class AnimalAndFish {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("меченосец Степан");
        System.out.println("Имя рыбы меченосца: "+m.name);
        m.eat();
        m.sleep();
        m.swim();
        System.out.println("-----------------------------------------------");
//      ------------------------------------------------------------------
        Penguin p = new Penguin("пингвин Гюнтер");
        System.out.println("Имя пингвина: "+p.name);
        p.eat();
        p.fly();
        p.speak();
        p.sleep();
        System.out.println("-----------------------------------------------");
//      ------------------------------------------------------------------
        Animal l1 = new Lion("Алекс");
        System.out.println("Животное типа лев имеет имя: "+l1.nameOfAnimal);
        l1.eat();
        l1.sleep();
        System.out.println("-----------------------------------------------");
//      ------------------------------------------------------------------
        Mammal l2 = new Lion("Алекс");
        System.out.println("Животное млекопитающее типа лев имеет имя: "+l2.nameOfMammal);
        l2.eat();
        l2.run();
        l2.sleep();
        
    }
}


//  ----------------------------------------------------------------------


abstract class Animal {

    String nameOfAnimal;

//  Конструктор абстрактного класса Animal
    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

//  Перезапиши методы в конкретном классе!
    abstract void eat();
    abstract void sleep();
}


//  ----------------------------------------------------------------------


abstract class Mammal extends Animal implements Speakable{

        String nameOfMammal;
        
        public Mammal(String nameOfMammal){
            super(nameOfMammal);
            this.nameOfMammal = nameOfMammal;
        }
        
        abstract void run();
        
}


//  ----------------------------------------------------------------------


abstract class Fish extends Animal {
    
    String nameOfFish;
    
    public Fish (String nameOfFish){
        super(nameOfFish);
        this.nameOfFish=nameOfFish;
    }
    
    @Override
    public void sleep(){
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
    
    abstract void swim();
}


//  ----------------------------------------------------------------------


abstract class Bird extends Animal implements Speakable{
    
    String nameOfBird;
    
    Bird(String nameOfBird){
        super(nameOfBird);
        this.nameOfBird = nameOfBird;
    }
    
    @Override
    public void eat(){
        System.out.println("Птица ест");
    }
    @Override
    public void sleep(){
        System.out.println("Птица спит");
    }
    
    abstract void fly();
    
    @Override
    public void speak(){
        System.out.println(nameOfBird+" sings");
    }
    
}

//  ----------------------------------------------------------------------


class Mechenosec extends Fish{
    
    String name;
    
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    
    @Override
    public void eat(){
        System.out.println("Меченосец мирная рыба которая ест обычный рыбий корм");
    }
    
    @Override
    public void swim(){
        System.out.println("Меченосец красивая рыба которая быстро плавает");
    }
}


//  ----------------------------------------------------------------------

class Penguin extends Bird{
    
    String name;
    
    Penguin (String name){
        super(name);
        this.name = name;
    }
    
    @Override
    public void eat(){
        System.out.println("Пингвин любит есть рыбу");
    }
    
    @Override
    public void sleep(){
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    
    @Override
    void fly(){
        System.out.println("Пингвины не летают");
    }
    
    @Override
    public void speak(){
        System.out.println("Пингвины не умеют петь как соловьи");
    }
    
    
}


//  ----------------------------------------------------------------------


class Lion extends Mammal {
    String lionsName;
    
    Lion (String lionsName){
        super(lionsName);
        this.lionsName = lionsName;
    }
    
    @Override
    void eat(){
        System.out.println("Лев, как и любой хищник, любит мясо");
    }
    
    @Override
    void sleep(){
        System.out.println("Лев большую часть дня спит");
    }
    
    @Override
    void run(){
        System.out.println("Лев - не самая быстрая кошка");
    }
}

//  ----------------------------------------------------------------------


interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}