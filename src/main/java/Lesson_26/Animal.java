
package Lesson_26;


public class Animal {
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {System.out.println("Static init of Animal");}
    {System.out.println("Non-tatic init of Animal");}
    
    public static void main(String[] args) {
        Lion a = new Lion();
    }
}

class Mammal extends Animal{
        Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {System.out.println("Static init of Mammal");}
    {System.out.println("Non-tatic init of Mammal");}
}

class Lion extends Mammal{
        Lion(){
        System.out.println("Constructor of Lion");
    }
    static {System.out.println("Static init of Lion");}
    {System.out.println("Non-tatic init of Lion");}
}